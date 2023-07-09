package com.geekster.EcommerceApp.repositories;

import com.geekster.EcommerceApp.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Integer> {
}
