package com.example.demo;

import com.example.Loose.NotificationService;
import org.springframework.stereotype.Component;


public class LifecycleBean {

    private NotificationService notificationService;

    public LifecycleBean(NotificationService notificationService){
        System.out.println("Constructor called = dependency injected");
        this.notificationService = notificationService;
    }


    public void init(){
        System.out.println("init called : bean initialized");
        notificationService.send("hello from init()");
    }
    public  void performTask(){
        System.out.println("ready for use");
    }

    public void cleanUp(){
        System.out.println("cleanup() being called");
    }
}
