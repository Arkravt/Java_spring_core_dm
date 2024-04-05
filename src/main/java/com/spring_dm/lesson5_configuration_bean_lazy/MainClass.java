package com.spring_dm.lesson5_configuration_bean_lazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = (User) ctx.getBean(User.class, "Artem", 30);
        System.out.println(user);
    }
}
