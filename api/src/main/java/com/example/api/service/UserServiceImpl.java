package com.example.api.service;

import com.example.api.config.JmsConfiguration;
import com.example.api.dto.UserDTO;
import com.example.api.enums.EnumTweetMessage;
import com.example.api.enums.EnumUserName;
import com.example.api.mapper.UserMapper;
import com.example.api.model.User;
import com.example.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @Autowired
    JmsTemplate jmsTemplate;

    @Override
    public List<User> getListUser() {
        return userRepository.findAll();
    }

    @Override
    public void createUser(UserDTO userDTO) {
        User user = userMapper.userDtoToUser(userDTO);
        userRepository.save(user);
        senToQueue(user);
    }

    @Override
    public void senToQueue(User user) {         // Varlık sınıfımdaki nitelikleri kuyruğa gönderiyorum.
        Long id = user.getId();
        String userName = user.getUserName();
        String tweet = user.getTweet();
        jmsTemplate.convertAndSend(JmsConfiguration.ID_QUEUE, id);
        jmsTemplate.convertAndSend(JmsConfiguration.USERNAME_QUEUE, userName);
        jmsTemplate.convertAndSend(JmsConfiguration.TWEET_QUEUE, tweet);
    }

    @Override
    public void createUserTest() {        // test amaçlı yazılmış metot , istediğim kadar user ekliyebilirim
        for (int i = 0; i < 12000; i++) {
            User user = new User();
            user.setUserName(String.valueOf(EnumUserName.randomEnum()));
            user.setTweet(String.valueOf(EnumTweetMessage.randomEnum()));
            userRepository.save(user);
            senToQueue(user);
        }
    }

    @Override
    public Long getLastUserIdCount(long id) {     // id sayısını çekiyorum
        return userRepository.countAllByIdAfter(id);
    }

    @Override
    public void sendAutoUserIdCount() {  // Zamanlayıcı kullanarak çektiğim id sayısını kuyruğa gönderiyorum
        long id = 0;
        long userCountId = getLastUserIdCount(id);
        jmsTemplate.convertAndSend(JmsConfiguration.USER_ID_COUNT_QUEUE,userCountId);
    }

    @Override
    public User getUserId(Long id) {
        return userRepository.findById(id).orElseThrow();
    }


}
