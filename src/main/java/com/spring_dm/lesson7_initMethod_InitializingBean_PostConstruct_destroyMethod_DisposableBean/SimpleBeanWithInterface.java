package com.spring_dm.lesson7_initMethod_InitializingBean_PostConstruct_destroyMethod_DisposableBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SimpleBeanWithInterface implements InitializingBean, DisposableBean {

    private final String DEFAULT_NAME = "Nik";

    private String name;
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

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(" Initializing bean");
        if (name == null) {
            System.out.println("Using default name");
            name = DEFAULT_NAME;
        }
        if (age == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("You must set age property " + SimpleBean.class);
        }
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying with interface !");
    }
}
