package com.eventflow.order.controller;

import com.eventflow.order.application.OrderApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderApplicationService orderService;

    @PostMapping("/create")
    public String createOrder(
            @RequestParam String orderId,
            @RequestParam String userId,
            @RequestParam Integer totalPrice
    ){
        orderService.createOrder(orderId, userId, totalPrice);
        return "order.create publish 성공!";
    }
}