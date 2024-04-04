package com.spring_dm.lesson4_profile_annotation.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"default", "eng"})
public class HelloServiceEnglishImpl implements HelloService {
    @Override
    public String getGreeting() {
        return "Hello";
    }
}
