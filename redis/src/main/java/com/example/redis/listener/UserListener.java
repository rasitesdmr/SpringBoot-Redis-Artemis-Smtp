package com.example.redis.listener;

import com.example.redis.config.JmsConfiguration;
import com.example.redis.model.User;
import com.example.redis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class UserListener{  // Kuyruklardan gelen mesajları alır ve redis repository'e kayıt eder.

    @Autowired
    UserRepository userRepository;

    User user = new User();

    @JmsListener(destination = JmsConfiguration.ID_QUEUE)
    public void idListener(Long message1) {
        user.setId(message1);
        userRepository.save(user);
    }

    @JmsListener(destination = JmsConfiguration.USERNAME_QUEUE)
    public void userNameListener(String message2) {
        user.setUserName(message2);
        userRepository.save(user);
    }

    @JmsListener(destination = JmsConfiguration.TWEET_QUEUE)
    public void tweetListener(String message3) {
        user.setTweet(message3);
        userRepository.save(user);
    }

}
