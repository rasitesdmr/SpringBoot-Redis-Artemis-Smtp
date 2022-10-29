package com.example.redis.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class JmsConfiguration{

    public static final String ID_QUEUE = "id-queue";
    public static final String USERNAME_QUEUE = "username-queue";
    public static final String TWEET_QUEUE = "tweet-queue";


}
