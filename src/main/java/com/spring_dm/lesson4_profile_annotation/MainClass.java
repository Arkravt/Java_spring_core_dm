package com.spring_dm.lesson4_profile_annotation;

import com.spring_dm.lesson4_profile_annotation.controller.HelloController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class MainClass {
    public static void main(String[] args) {

        /*
            Один из вариантов работы с @Profile:
            1. Создается ссылка AnnotationConfigApplicationContext.
            2. Получаем окружение getEnvironment().
            3. Устанавливаем активный профиль setActiveProfiles(), чтобы мы могли использовать все бины у которых есть подходящий @Profile.
                (тот профиль который мы указали в классах с аннотацией @Profile).
            4. Регистрируем register() класс с аннотацией @ComponentScan для поиска наших бинов.
            5. Обновляем - refresh().
            6. Как обычно через контекст получаем нужные объекты(бины).
         */

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("span"); // То самое имя профиля который указан в классе с аннотацией @Profile.
        ctx.register(MainClass.class);
        ctx.refresh();

        HelloController helloController = ctx.getBean("helloController", HelloController.class);
        helloController.sayHello();
    }
}
