package com.eventflow.common.event;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InventoryUpdatedEvent {
    private EventHeader header;
    private Payload payload;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Payload {
        private String orderId;
        private List<ProductStock> updatedProducts;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class ProductStock {
        private String ProductId;
        private Integer quantityChanged; // ex : -2
        private Integer stockAfter;      // ex : 18
    }
}