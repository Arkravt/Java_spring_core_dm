package com.spring_dm.lesson3_Dependency_injection_annotations;

import org.springframework.stereotype.Component;

@Component
public class EngineV6 implements Engine {
    @Override
    public void startEngine() {
        System.out.println("starting v6 engine");
    }
}
