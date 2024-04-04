package com.spring_dm.lesson2_Dependency_injection_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan("com.spring_dm.lesson3_Dependency_injection_annotations")
public class MainClass {
    public static void main(String[] args) {
        //TestComponentScanXML();
        TestComponentScanAnnotation();
    }

    private static void TestComponentScanXML() {
        ApplicationContext context = new ClassPathXmlApplicationContext("lesson2_annotations/Context_component_scan.xml");
        Car bmw = (Car) context.getBean("car");
        bmw.go();
    }

    public static void TestComponentScanAnnotation() {
        /*
            В конструктор new AnnotationConfigApplicationContext нужно передать класс с аннотацией @ComponentScan,
            чтобы Spring понимал какую директорию ему нужно сканировать.
         */
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MainClass.class);
        Car car = ctx.getBean("car", Car.class);
        car.go();
    }
}


