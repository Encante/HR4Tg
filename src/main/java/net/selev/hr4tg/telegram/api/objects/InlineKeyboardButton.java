package net.selev.hr4tg.telegram.api.objects;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InlineKeyboardButton {
    String text;
    String url;
    String callbackData;
    WebAppInfo webApp;
    LoginUrl loginUrl;
    String switchInlineQuery;
    String switchInlineQueryCurrentChat;
    CallbackGame callbackGame;
    boolean pay;

    public InlineKeyboardButton(String keyText) {
        this.text = keyText;
        this.callbackData=text;
    }
    public InlineKeyboardButton(String keyText, String callbackData){
        this.text=keyText;
        this.callbackData=callbackData;
    }
}
