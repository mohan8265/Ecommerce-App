package com.geekster.EcommerceApp.repositories;

import com.geekster.EcommerceApp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {
}
