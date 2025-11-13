package com.Cardinality.controller;

import com.Cardinality.model.User;
import com.Cardinality.model.UserRegistered;
import com.Cardinality.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserRegistered> registerUser(@RequestBody User user) {
        try {
            User registeredUser = userService.register(user);
            UserRegistered userRegistered = new UserRegistered();
            userRegistered.setName(registeredUser.getName());
            userRegistered.setEmail(registeredUser.getEmail());
            return ResponseEntity.ok(userRegistered);
        } catch (Exception e) {
            // You can customize error handling as needed
            return ResponseEntity.badRequest().build();
        }
    }
}
