package net.selev.hr4tg.telegram.api.objects;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MessageEntity {
    String type;
    Long offset;
    Long lenght;
    String url;
    User user;
    String language;
    String customEmojiId;
}
