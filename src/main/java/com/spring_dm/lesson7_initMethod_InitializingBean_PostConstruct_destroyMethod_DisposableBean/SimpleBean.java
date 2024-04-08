package com.spring_dm.lesson7_initMethod_InitializingBean_PostConstruct_destroyMethod_DisposableBean;

public class SimpleBean {

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

    public void init() {
        System.out.println(" Initialization bean");
        if (name == null) {
            System.out.println("Using default name");
            name = DEFAULT_NAME;
        }
        if (age == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("You must set age property " + SimpleBean.class);
        }
    }

    public void destroyMethod() {
        System.out.println("destroying ! ");
    }
}
