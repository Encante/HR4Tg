package net.selev.hr4tg.telegram.api.objects;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class VideoNote {
    String fileId;
    String fileUniqueId;
    Long length;
    Long duration;
    PhotoSize thumb;
    Long fileSize;
}
