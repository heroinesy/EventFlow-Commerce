package com.eventflow.common.event;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentCompletedEvent {
    private EventHeader header;
    private Payload payload;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    private static class Payload {
        private String paymentId;
        private String orderId;
        private String userId;
        private String status;
        private Integer paidAmount;
        private String paymentMethod;
    }
}