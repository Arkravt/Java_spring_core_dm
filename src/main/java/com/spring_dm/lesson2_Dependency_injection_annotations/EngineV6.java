package com.spring_dm.lesson2_Dependency_injection_annotations;

import org.springframework.stereotype.Component;

@Component("engineV6")
public class EngineV6 implements Engine {
    @Override
    public void startEngine() {
        System.out.println("starting v6 engine");
    }
}
