package com.example.redis.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@RedisHash("users")
public class User implements Serializable{

    @Id
    private Long id;

    private String userName;

    private String tweet;


}
