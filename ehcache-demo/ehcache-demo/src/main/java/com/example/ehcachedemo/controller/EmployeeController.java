package com.example.ehcachedemo.controller;

import com.example.ehcachedemo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/test")
    public String getUsers(@PathVariable Long id) {

        SYsstem.out.println("Test endpoint called with id: " + id);
        SYsstem.out.println("Test endpoint called with id: " + id);
        return userService.getUserById(id);
    }
}
