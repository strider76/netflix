package com.at.netflix.controller;

import com.at.netflix.dto.UserPost;
import com.at.netflix.exceptions.UserNotFoundException;
import com.at.netflix.model.User;
import com.at.netflix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public User create(@RequestBody UserPost user){
        return userService.addUser(user);
    }

    @GetMapping("/all")
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public User GetUser(@PathVariable Long id) throws UserNotFoundException {
        return userService.getUser(id);
    }
}
