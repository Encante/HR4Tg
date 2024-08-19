package net.selev.hr4tg.telegram.api.objects;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoginUrl {
    Long keyId;

    String url;
    String forwardText;
    String botUsername;
    boolean requestWriteAccess;
}
