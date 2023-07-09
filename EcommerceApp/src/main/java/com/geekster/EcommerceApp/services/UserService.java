package com.geekster.EcommerceApp.services;

import com.geekster.EcommerceApp.models.User;
import com.geekster.EcommerceApp.repositories.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepo userRepo;

    public String createUser(User user) {
        userRepo.save(user);
        return "User created";
    }

    public User getUserById(Integer id) {
        return userRepo.findById(id).get();
    }
}
