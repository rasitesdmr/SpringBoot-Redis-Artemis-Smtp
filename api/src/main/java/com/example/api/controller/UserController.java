package com.example.api.controller;

import com.example.api.dto.UserDTO;
import com.example.api.mapper.UserMapper;
import com.example.api.model.User;
import com.example.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController{

    @Autowired
    UserService userService;


    @GetMapping("/getUserList")
    public List<User> findAllUserList(){
        return userService.getListUser();
    }

    @PostMapping("/createUser")
    public void createUser(@RequestBody UserDTO userDTO) {
         userService.createUser(userDTO);
    }

    @PostMapping("/createTestUser")  // Test metodudur.
    public void createUser() {
        userService.createUserTest();
    }

    @GetMapping("/userlist/{id}")
    public User getByUserId(@PathVariable("id") Long id ){
        return userService.getUserId(id);
    }

}
