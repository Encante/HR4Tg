package net.selev.hr4tg.telegram.api.objects;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SuccessfulPayment {
    String currency;
    Long totalAmount;
    String invoicePayload;
    String shippingOptionId;
    OrderInfo orderInfo;
    String telegramPaymentChargeId;
    String providerPaymentChargeId;
}
