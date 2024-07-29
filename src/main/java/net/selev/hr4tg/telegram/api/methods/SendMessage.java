package net.selev.hr4tg.telegram.api.methods;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import net.selev.hr4tg.telegram.api.objects.MessageEntity;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class SendMessage {
    Long chatId;
    Long messageThreadId;
    String text;
    String parseMode;
    ArrayList<MessageEntity> entities;
    boolean disableWebPagePreview;
    boolean disableNotification;
    boolean protectContent;
    Long replyToMessageId;
    boolean allowSendingWithoutReply;
    Object replyMarkup;

    public SendMessage(Long chatId, String text) {
        this.chatId = chatId;
        this.text = text;
    }
}
