package com.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myBean")
public class Student {
    private Laptop laptop;

    Student(){

    }

    @Autowired
    Student(Laptop laptop){
        this.laptop = laptop;
    }

    public  void useLaptop(){
        System.out.println("student using laptop");
        laptop.Start();
    }
}
