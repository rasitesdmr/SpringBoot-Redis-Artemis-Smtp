package com.example.email.listener;

import com.example.email.config.JmsConfiguration;
import com.example.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class LastUserIdRequestListener{

    @Autowired
    EmailService emailService;

    @JmsListener(destination = JmsConfiguration.USER_ID_COUNT_QUEUE)
    public void simpleMessage(long id) {  // Kuyruktan gelen id sayısını alır ve EmailService sınıfından sendSimpleMail(id) metodunu tetikler.
        emailService.sendSimpleMail(id);
    }

}
