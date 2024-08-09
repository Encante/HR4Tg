package net.selev.hr4tg.telegram.api.objects;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Poll {
    String id;
    String question;
    ArrayList<PollOption> options;
    Long totalVoterCount;
    boolean isClosed;
    boolean isAnonymous;
    String type;
    boolean allowsMultipleAnswers;
    Long correctOptionId;
    String explanation;
    ArrayList<MessageEntity> explanationEntities;
    Long openPeriod;
    Long closeDate;
}
