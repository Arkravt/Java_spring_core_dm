package com.spring_dm.lesson2_Dependency_injection_annotations;

import org.springframework.stereotype.Component;

@Component("EngineV12")
public class EngineV12 implements Engine {
    @Override
    public void startEngine() {
        System.out.println("starting v12 engine");
    }
}
