package com.example.api.schedule;

import com.example.api.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ScheduleUserCountsIdService{

    @Autowired
    UserService userService;

    @Scheduled(cron = "${cron.expression}")
    public void scheduleUserIdCounts() {   // Bir zamanlayıcı oluşturdum ve UserService sınıfındaki, sendAutoUserIdCount() metodumu tetikliyorum.
        userService.sendAutoUserIdCount();
        log.info("Cron Başladı");
    }
}
