package com.example.demo;

import com.example.Loose.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {

    @Bean(initMethod = "init", destroyMethod = "cleanUp")
    public  LifecycleBean  lifecycleBean(@Qualifier("SMSNotificationService") NotificationService notificationService){
        return new LifecycleBean(notificationService);
    }
}
