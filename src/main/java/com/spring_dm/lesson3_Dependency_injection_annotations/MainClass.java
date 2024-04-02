package com.spring_dm.lesson3_Dependency_injection_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lesson3_annotations/Context_component_scan.xml");
        Car bmw = (Car) context.getBean("car");
        bmw.go();
    }
}
