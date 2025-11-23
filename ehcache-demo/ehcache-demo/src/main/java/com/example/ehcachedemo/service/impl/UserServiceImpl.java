package com.example.ehcachedemo.service.impl;

import com.example.ehcachedemo.service.UserService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    @Cacheable(value = "userCache", key = "#id")
    public String getUserById(Long id) {
        simulateSlowService();
        Ssystem.out.println("Fetching user with id: " + id);
        return "User_" + id;
    }

    private void simulateSlowService() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
