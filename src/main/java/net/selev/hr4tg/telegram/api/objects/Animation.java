package net.selev.hr4tg.telegram.api.objects;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Animation {
    String fileId;
    String fileUniqueId;
    Long width;
    Long height;
    Long duration;
    PhotoSize thumb;
    String fileName;
    String mimeType;
    Long fileSize;
}
