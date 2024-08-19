package net.selev.hr4tg.telegram.api.objects;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class VideoChatParticipantsInvited {
    ArrayList<User> users;
}
