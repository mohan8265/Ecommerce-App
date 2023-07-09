package com.geekster.EcommerceApp.services;

import com.geekster.EcommerceApp.models.Address;
import com.geekster.EcommerceApp.repositories.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    private IAddressRepo addressRepo;

    public String createAddress(Address address) {
        addressRepo.save(address);
        return "address created";
    }
}
