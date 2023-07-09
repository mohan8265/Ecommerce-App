package com.geekster.EcommerceApp.services;

import com.geekster.EcommerceApp.models.Product;
import com.geekster.EcommerceApp.repositories.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private IProductRepo productRepo;

    public String createProduct(Product product) {
        productRepo.save(product);
        return "product created";
    }

    public List<Product> getAllProductsByCategory(String category) {
        return productRepo.findAllByProductCategory(category);
    }

    public String deleteById(Integer id) {
        Product product = productRepo.findById(id).get();
        if(product != null) {
            productRepo.deleteById(id);
            return "product deleted";
        }else {
            return "product with id " + id + " doesn't exist";
        }
    }
}
