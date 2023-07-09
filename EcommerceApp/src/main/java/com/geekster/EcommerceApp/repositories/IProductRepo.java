package com.geekster.EcommerceApp.repositories;

import com.geekster.EcommerceApp.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductRepo extends JpaRepository<Product,Integer> {
    List<Product> findAllByProductCategory(String category);
}
