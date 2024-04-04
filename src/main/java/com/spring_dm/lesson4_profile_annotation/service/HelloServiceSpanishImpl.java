package com.spring_dm.lesson4_profile_annotation.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("span")
public class HelloServiceSpanishImpl implements HelloService {
    @Override
    public String getGreeting() {
        return "Hola";
    }
}
