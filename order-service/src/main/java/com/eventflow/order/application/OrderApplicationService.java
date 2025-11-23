package com.eventflow.order.application;

import com.eventflow.common.event.EventHeader;
import com.eventflow.common.event.OrderCreatedEvent;
import com.eventflow.order.infrastructure.kafka.OrderEventProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderApplicationService {
    private final OrderEventProducer eventProducer;
    public void createOrder(String orderId, String userId, Integer totalPrice) {
        EventHeader header = EventHeader.builder()
                .eventId(UUID.randomUUID().toString())
                .eventType("order.created")
                .version("1.0")
                .timestamp(System.currentTimeMillis())
                .source("order-service")
                .build();

        List<OrderCreatedEvent.OrderItem> items = List.of();

        OrderCreatedEvent event = OrderCreatedEvent.of(
                header,
                orderId,
                userId,
                totalPrice,
                items
        );
        eventProducer.publish(event);
    }
}