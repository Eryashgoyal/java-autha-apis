package com.yash.auth_apis.service;

import com.yash.auth_apis.bean.User;
import com.yash.auth_apis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        if (userRepository.findByUsername(user.getUsername()) != null) {
            throw new RuntimeException("Username already exists");
        }

       

        // Perform user registration
        return userRepository.save(user);
    }
}
