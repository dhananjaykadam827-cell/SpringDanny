package com.example.demo;

import com.example.Loose.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    static void main(String[] args) {
//        ApplicationContext context
//                = new AnnotationConfigApplicationContext(AppConfig.class);
//        GreetingService greetingService
//                = context.getBean(GreetingService.class);
//        greetingService.sayHello();
//
//
//        UserService userService
//                = context.getBean(UserService.class);
//        userService.notifyUser("What's up!");

//        UserService userServiceEmail
//                = (UserService) context.getBean("UserServiceEmail");
//        userServiceEmail.notifyUser("What's up!");
        System.out.println("started");
        ApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("retriving bean");

        LifecycleBean lifecycleBean =
                context.getBean(LifecycleBean.class);
        lifecycleBean.performTask();
        System.out.println("closing");
    }
}
