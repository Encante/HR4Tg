package net.selev.hr4tg.telegram.api.objects;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults (level = AccessLevel.PRIVATE)
public class EncryptedPassportElement {
    String type;
    String data;
    String phoneNumber;
    String email;
    ArrayList<PassportFile> files;
    PassportFile frontInside;
    PassportFile reverseSide;
    PassportFile selfie;
    ArrayList<PassportFile> translation;
    String hash;
}
