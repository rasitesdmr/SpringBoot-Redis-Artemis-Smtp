package com.example.api.service;

import com.example.api.dto.UserDTO;
import com.example.api.model.User;

import java.util.List;

public interface UserService{

    List<User> getListUser();

    void createUser(UserDTO userDTO);

    void senToQueue(User user);         // Kuyruğa gönder

    void createUserTest();

    Long getLastUserIdCount(long id);

    void sendAutoUserIdCount();

    User getUserId(Long id );
}
