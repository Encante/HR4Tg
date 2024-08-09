package net.selev.hr4tg.telegram.api.objects;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Location {
    Float longitude;
    Float latitude;
    Float horizontalAccuracy;
    Long livePeriod;
    Long heading;
    Long proximityAlertRadius;
}
