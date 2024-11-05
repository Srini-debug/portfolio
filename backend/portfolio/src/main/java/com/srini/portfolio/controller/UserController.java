package com.srini.portfolio.controller;

import com.srini.portfolio.model.User;
import com.srini.portfolio.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;

    // Constructor
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Save a new user
    @PostMapping
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    // Get list of all users
    @GetMapping
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
