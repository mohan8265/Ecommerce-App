package com.geekster.EcommerceApp.controllers;

import com.geekster.EcommerceApp.models.Product;
import com.geekster.EcommerceApp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    private String createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
    @GetMapping("/products")
    private List<Product> getAllProductsByCategory(@RequestParam String category){
        return productService.getAllProductsByCategory(category);
    }
    @DeleteMapping("/products/{id}")
    public String deleteById(@PathVariable Integer id){
        return productService.deleteById(id);
    }
}
