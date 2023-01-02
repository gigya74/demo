package com.example.demo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration
@EnableScheduling
public class SpringConfig {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat(
            "MM/dd/yyyy HH:mm:ss");
    @Scheduled(cron = "*/5 * * * * *")
    public void performTaskUsingCron() {

        System.out.println("Regular task performed using Cron at "
                + dateFormat.format(new Date()));

    }
}
