package com.spring_dm.lesson1_setter_constructor_Dependency_Injection_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lesson1_Context_setter_constructor_xml/Context_example_constructor.xml");
        //ApplicationContext context = new ClassPathXmlApplicationContext("Context_setter_constructor_xml/Context_example_setters.xml");
        //ApplicationContext context = new ClassPathXmlApplicationContext("Context_setter_constructor_xml/Context_example_setters_chemaP.xml");
        Car bmw = (Car) context.getBean("car");
        bmw.go();
    }
}
