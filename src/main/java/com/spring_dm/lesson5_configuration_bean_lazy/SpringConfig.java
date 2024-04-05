package com.spring_dm.lesson5_configuration_bean_lazy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class SpringConfig {

    @Bean
    @Lazy(value = true)
    public User getUser(String name, int age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return user;
    }

}
