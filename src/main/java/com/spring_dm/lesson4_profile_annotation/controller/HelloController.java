package com.spring_dm.lesson4_profile_annotation.controller;

import com.spring_dm.lesson4_profile_annotation.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class HelloController {

    private HelloService helloService;

    @Autowired
    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public void sayHello() {
        System.out.println(helloService.getGreeting());
    }
}
