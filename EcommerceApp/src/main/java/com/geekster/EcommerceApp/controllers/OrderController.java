package com.geekster.EcommerceApp.controllers;

import com.geekster.EcommerceApp.models.Orders;
import com.geekster.EcommerceApp.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/orders")
    public String createOrder(@RequestBody Orders orders){
        return orderService.createOrder(orders);
    }

    @GetMapping("/orders/{id}")
    public Orders getById(@PathVariable Integer id){
        return orderService.getById(id);
    }

}
