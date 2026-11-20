package com.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigApp2.class);

        Student student = (Student) context.getBean("myBean");
        student.useLaptop();
    }
}
