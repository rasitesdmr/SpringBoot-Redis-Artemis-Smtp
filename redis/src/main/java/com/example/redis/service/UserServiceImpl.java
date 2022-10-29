package com.example.redis.service;

import com.example.redis.model.User;
import com.example.redis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;


    @Override
    @Cacheable(value = "AllUserCache")
    public List<User> getAllUsers() {
        System.out.println("Veritabanından çekildi");
        return (List<User>) userRepository.findAll();
    }
}
