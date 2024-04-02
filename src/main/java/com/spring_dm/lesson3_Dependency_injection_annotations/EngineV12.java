package com.spring_dm.lesson3_Dependency_injection_annotations;

public class EngineV12 implements Engine {
    @Override
    public void startEngine() {
        System.out.println("starting v12 engine");
    }
}
