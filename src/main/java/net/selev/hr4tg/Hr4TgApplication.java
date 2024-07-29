package net.selev.hr4tg;

import lombok.extern.slf4j.Slf4j;
import net.selev.hr4tg.config.Secrets;
import net.selev.hr4tg.telegram.api.methods.SendMessage;
import net.selev.hr4tg.telegram.api.objects.Response;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class Hr4TgApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Hr4TgApplication.class, args);
        Secrets secrets = ctx.getBean(Secrets.class);
        RestClient rc = ctx.getBean(RestClient.class);
        SendMessage msg = new SendMessage(secrets.JA_CHATID,"Test Message");
        Response response = rc.standardTgJsonPost("sendmessage", msg);
        log.info("Send Message {}",response.toString());
    }
}