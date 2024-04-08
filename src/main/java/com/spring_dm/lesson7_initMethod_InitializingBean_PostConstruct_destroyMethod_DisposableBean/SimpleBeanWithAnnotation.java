package com.spring_dm.lesson7_initMethod_InitializingBean_PostConstruct_destroyMethod_DisposableBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SimpleBeanWithAnnotation {

    private final String DEFAULT_NAME = "Nik";

    @Value("Artem")
    private String name;

    @Value("32")
    private int age = Integer.MIN_VALUE;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + name + ", age=" + age;
    }

    @PostConstruct
    public void getByAnnotation() {
        System.out.println(" Initializing bean");
        if (name == null) {
            System.out.println("Using default name");
            name = DEFAULT_NAME;
        }
        if (age == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("You must set age property " + SimpleBean.class);
        }
    }

    @PreDestroy
    public void destroyByAnnotation() {
        System.out.println("Destroying with annotation !");
    }
}
