package net.selev.hr4tg.telegram.api.objects;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Sticker {
    String fileId;
    String fileUniqueId;
    String type;
    Long width;
    Long height;
    boolean isAnimated;
    boolean isVideo;
    PhotoSize thumb;
    String emoji;
    String setName;
    File premiumAnimation;
    MaskPosition maskPosition;
    String customEmojiId;
    Long fileSize;
}
