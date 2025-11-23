package com.eventflow.order.infrastructure.kafka;

import com.eventflow.common.event.OrderCreatedEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class OrderEventProducer {
    private final KafkaTemplate<String, Object> kafkaTemplate;
    private static final String TOPIC = "order.created";

    public void publish(OrderCreatedEvent event) {
        log.info("[ORDER-PRODUCER] Publishing event -> {}", event);
        kafkaTemplate.send(TOPIC,event);
    }
}