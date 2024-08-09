package net.selev.hr4tg.telegram.api.objects;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Audio {
    String fileId;
    String fileUniqueId;
    Long duration;
    String performer;
    String title;
    String fileName;
    String mimeType;
    Long fileSize;
    PhotoSize thumb;
}
