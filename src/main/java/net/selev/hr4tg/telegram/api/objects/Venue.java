package net.selev.hr4tg.telegram.api.objects;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Venue {
    Location location;
    String title;
    String address;
    String foursquareId;
    String foursquareType;
    String googlePlaceId;
    String googlePlaceType;
}
