package net.selev.hr4tg.telegram.api.objects;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PhotoSize {
    String fileId;
    String fileUniqueId;
    Long width;
    Long height;
    Long fileSize;
}
