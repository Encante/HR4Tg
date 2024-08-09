package net.selev.hr4tg.telegram.api.objects;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShippingAddress {
    String countryCode;
    String state;
    String city;
    String streetLine1;
    String streetLine2;
    String postCode;
}
