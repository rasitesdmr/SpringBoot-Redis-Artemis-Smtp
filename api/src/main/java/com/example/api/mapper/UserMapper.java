package com.example.api.mapper;

import com.example.api.dto.UserDTO;
import com.example.api.model.User;
import org.mapstruct.Mapper;


@Mapper
public interface UserMapper{

    User userDtoToUser(UserDTO userDTO);

}
