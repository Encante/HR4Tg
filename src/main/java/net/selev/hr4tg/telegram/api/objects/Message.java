package net.selev.hr4tg.telegram.api.objects;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Message {
    Long messageId;
    Long messageThreadId;
    User from;
    Chat senderChat;
    Long date;
    Chat chat;
    User forwardFromChat;
    Long forwardFromMessageId;
    String forwardSignature;
    String forwardSenderName;
    Long forwardDate;
    Boolean isTopicMessage;
    Boolean isAutomaticForward;
    Message replyToMessage;
    User viaBot;
    Long editDate;
    Boolean hasProtectedContent;
    String mediaGroupId;
    String authorSignature;
    String text;
    ArrayList<MessageEntity> entities;
    Animation animation;
    Audio audio;
    Document document;
    ArrayList<PhotoSize> photo;
    Sticker sticker;
    Video video;
    VideoNote videoNote;
    Voice voice;
    String caption;
    ArrayList<MessageEntity> captionEntities;
    Contact contact;
    Dice dice;
    Game game;
    Poll poll;
    Venue venue;
    Location location;
    ArrayList<User> newChatMembers;
    User leftChatMember;
    String newChatTitle;
    ArrayList<PhotoSize> newChatPhoto;
    Boolean deleteChatPhoto;
    Boolean groupChatCreated;
    Boolean supergroupChatCreated;
    Boolean channelChatCreated;
    MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged;
    Long migrateToChatId;
    Long migrateFromChatId;
    Message pinnedMessage;
    Invoice invoice;
    SuccessfulPayment successfulPayment;
    String connectedWebsite;
    PassportData passportData;
    ProximityAlertTriggered proximityAlertTriggered;
    ForumTopicCreated forumTopicCreated;
    ForumTopicClosed forumTopicClosed;
    ForumTopicReopened forumTopicReopened;
    VideoChatScheduled videoChatScheduled;
    VideoChatStarted videoChatStarted;
    VideoChatEnded videoChatEnded;
    VideoChatParticipantsInvited videoChatParticipantsInvited;
    WebAppData webAppData;
    InlineKeyboardMarkup replyMarkup;
}
