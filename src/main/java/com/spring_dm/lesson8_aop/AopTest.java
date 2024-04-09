package com.spring_dm.lesson8_aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class AopTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acat = new AnnotationConfigApplicationContext(AopTest.class);
        StudentJava studentJava = acat.getBean("studentJava", StudentJava.class);
        studentJava.getMessage();
        studentJava.getName();
    }
}
