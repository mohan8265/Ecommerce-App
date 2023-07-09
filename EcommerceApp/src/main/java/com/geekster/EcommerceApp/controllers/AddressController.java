package com.geekster.EcommerceApp.controllers;

import com.geekster.EcommerceApp.models.Address;
import com.geekster.EcommerceApp.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping("/addresses")
    public String createAddress(@RequestBody Address address){
        return addressService.createAddress(address);
    }
}
