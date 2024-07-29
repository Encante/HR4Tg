package net.selev.hr4tg.telegram.api.objects;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    Long id;
    Boolean isBot;
    String firstName;
    String lastName;
    String username;
    String languageCode;
    Boolean isPremium;
    Boolean addedToAttachmentMenu;
    Boolean canJoinGroups;
    Boolean canReadAllGroupMessages;
    Boolean supportInlineQueries;
}
