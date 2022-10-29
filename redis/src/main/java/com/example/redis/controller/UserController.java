package com.example.redis.controller;


import com.example.redis.model.User;
import com.example.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/redis")
public class UserController{
    @Autowired
    UserService userService;

    @GetMapping("/getUserList")
    public List<User> findAllUsers(){
        return userService.getAllUsers();
    }


}
