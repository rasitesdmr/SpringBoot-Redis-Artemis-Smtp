package com.example.email.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmailServiceImpl implements EmailService{

    @Autowired
    JavaMailSender javaMailSender;
    @Value("${spring.mail.username}")
    private String sender;

    @Override
    public void sendSimpleMail(long id) {  // smtp kullanarak mail gönderme işlemi
        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setFrom(sender);
            mailMessage.setTo("deneme@gmail.com");
            mailMessage.setText(String.valueOf(id));
            javaMailSender.send(mailMessage);
            log.info("Email başarıyla gönderildi");
        } catch (Exception exception) {
            log.error("Error :" + exception);
        }

    }
}
