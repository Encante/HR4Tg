package net.selev.hr4tg.telegram.api.objects;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.lang.NonNull;

import java.util.ArrayList;
import java.util.Collections;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class InlineKeyboardMarkup {
    ArrayList<ArrayList<InlineKeyboardButton>> inlineKeyboard;
    InlineKeyboardMarkup(KeyboardBuilder builder){
        this.inlineKeyboard = builder.keyboardLayout;
    }

    public InlineKeyboardMarkup(ArrayList<ArrayList<InlineKeyboardButton>> inlineKeyboard){
        this.inlineKeyboard=inlineKeyboard;
    }
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class KeyboardBuilder {
        @org.springframework.lang.NonNull
        final int rows;
        @org.springframework.lang.NonNull
        final int cols;
        @NonNull
        final ArrayList<String> names;
        ArrayList<ArrayList<InlineKeyboardButton>> keyboardLayout;

        public KeyboardBuilder(int rows, int cols, String ...namesStream){
            this.rows=rows;
            this.cols=cols;
            this.names=new ArrayList<>();
            Collections.addAll(this.names, namesStream);
        }
        public InlineKeyboardMarkup build(){
            ArrayList<InlineKeyboardButton> rowx = new ArrayList<>();
            this.keyboardLayout =new ArrayList<>();
//            check if there is suitable names for all buttons
            if(rows*cols <= names.size()) {
                for (int i = 0; i < cols; i++) {
                    for (int j = 0; j < rows; j++) {
                        rowx.add(new InlineKeyboardButton(this.names.getFirst()));
                        this.names.removeFirst();
                    }
                    this.keyboardLayout.add(rowx);
                    rowx = new ArrayList<>();
                }
                return new InlineKeyboardMarkup(this);
            }
            else{
                System.out.println("Not enough names for all buttons.");
            }
            throw new RuntimeException("couldn't build a keyboard");
        }
    }
}
