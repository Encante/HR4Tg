package net.selev.hr4tg.telegram.api.objects;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Document {
    String fileId;
    String fileUniqueId;
    PhotoSize thumb;
    String fileName;
    String mimeType;
    Long fileSize;
}
