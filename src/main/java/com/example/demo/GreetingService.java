package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {
    public void sayHello(){
        System.out.println("hello from spring!");
    }
}
