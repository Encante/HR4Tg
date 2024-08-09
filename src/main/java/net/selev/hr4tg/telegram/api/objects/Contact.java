package net.selev.hr4tg.telegram.api.objects;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Contact {
    String phoneNumber;
    String firstName;
    String lastName;
    Long userId;
    String vcard;
}
