package com.eventflow.common.event;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SettlementCompletedEvent {
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
        private String status;
        private String completedAt;
    }
}