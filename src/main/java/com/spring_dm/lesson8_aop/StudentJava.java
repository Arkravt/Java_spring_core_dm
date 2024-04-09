package com.spring_dm.lesson8_aop;

import org.springframework.stereotype.Component;

@Component
public class StudentJava {

    public void getMessage() {
        // Add some AOP logic
        System.out.println("Hello. I'm StudentJava");
    }

    public String getName() {
        return "Artem";
    }

}
