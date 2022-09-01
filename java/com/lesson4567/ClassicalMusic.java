package com.lesson4567;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("singleton")
//@Scope("prototype")
public class ClassicalMusic implements Music{

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    @PostConstruct
    public void doMyInt(){
        System.out.println("Do my initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Do my destruction");
    }


//    private ClassicalMusic(){}

    public static ClassicalMusic getCLassicalMusic(){
        return new ClassicalMusic();
    }
}
