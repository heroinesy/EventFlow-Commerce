package com.eventflow.common.event;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SettlementStartedEvent {
    private EventHeader header;
    private Payload payload;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Payload {
        private String settlementId;
        private String orderId;
        private String userId;
        private double commissionRate; // 수수료
        private Integer settlementAmount;
    }
}