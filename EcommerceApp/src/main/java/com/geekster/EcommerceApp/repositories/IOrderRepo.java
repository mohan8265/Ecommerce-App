package com.geekster.EcommerceApp.repositories;

import com.geekster.EcommerceApp.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<Orders,Integer> {
}
