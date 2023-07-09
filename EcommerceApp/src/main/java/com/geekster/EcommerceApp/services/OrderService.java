package com.geekster.EcommerceApp.services;

import com.geekster.EcommerceApp.models.Orders;
import com.geekster.EcommerceApp.repositories.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private IOrderRepo orderRepo;

    public String createOrder(Orders orders) {
        orderRepo.save(orders);
        return "order placed successfully";
    }

    public Orders getById(Integer id) {
        return orderRepo.findById(id).get();
    }
}
