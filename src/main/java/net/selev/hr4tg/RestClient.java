package net.selev.hr4tg;

import com.google.gson.Gson;
import kong.unirest.core.*;
import lombok.extern.slf4j.Slf4j;
import net.selev.hr4tg.config.Secrets;
import net.selev.hr4tg.telegram.api.objects.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RestClient {
    private final Secrets secrets;
    private final Gson gson;
    private HttpResponse<JsonNode> lastResponse;

    @Autowired
    public RestClient(Secrets secrets, Gson gson) {
        this.secrets = secrets;
        this.gson = gson;
        Unirest.config()
                .interceptor(new Interceptor() {
            @Override
            public void onRequest(HttpRequest<?> request, Config config) {
                log.debug("Request: {} {}", request.getHttpMethod(), request.getUrl());
                log.debug("Headers: {}", request.getHeaders());
                request.getBody().ifPresent(body -> log.debug("Body: {}", body.uniPart().toString()));
            }

            @Override
            public void onResponse(HttpResponse<?> response, HttpRequestSummary request, Config config) {
                log.debug("Response for: {} {}", request.getHttpMethod(), request.getUrl());
                log.debug("Status: {}", response.getStatus());
                log.debug("Headers: {}", response.getHeaders());
                log.debug("Body: {}", response.getBody().toString());
            }
        })
                .setObjectMapper(new ObjectMapper() {

                    @Override
                    public <T> T readValue(String value, Class<T> valueType) {
                        try {
                            return gson.fromJson(value, valueType);
                        }catch (Exception e){
                            throw new RuntimeException(e);
                        }
                    }

                    @Override
                    public String writeValue(Object value) {
                        try {
                            return gson.toJson(value);
                        }catch (Exception e){
                            throw new RuntimeException(e);
                        }
                    }
                });
    }

    public Response standardTgJsonPost (String additionalUrl,Object objectToSend){
        this.lastResponse = Unirest.post(secrets.BASE_URL + additionalUrl)
                .header("Content-Type", "application/json")
                .body(objectToSend)
                .asJson();
        return gson.fromJson(lastResponse.getBody().toString(), Response.class);
    }
}
