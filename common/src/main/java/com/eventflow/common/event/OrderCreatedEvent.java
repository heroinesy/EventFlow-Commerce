package com.eventflow.common.event;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderCreatedEvent {
    private EventHeader header;
    private Payload payload;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Payload {
        private String orderId;
        private String userId;
        private Integer totalPrice;
        private List<OrderItem> items;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class OrderItem {
        private String productId;
        private Integer quantity;
        private Integer price;
    }

    public static OrderCreatedEvent of(
            EventHeader header ,
            String orderId,
            String userId,
            Integer totalPrice,
            List<OrderItem> items
    ) {
        Payload payload = Payload.builder()
                .orderId(orderId)
                .userId(userId)
                .totalPrice(totalPrice)
                .items(items)
                .build();

        return OrderCreatedEvent.builder()
                .header(header)
                .payload(payload)
                .build();
    }
}