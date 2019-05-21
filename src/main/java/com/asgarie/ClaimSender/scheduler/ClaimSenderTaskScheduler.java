package com.asgarie.ClaimSender.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ClaimSenderTaskScheduler {

    @Scheduled(fixedRate= 2000)
    public void performTask() {
        System.out.println("This is simple example using spring batch");
    }

}