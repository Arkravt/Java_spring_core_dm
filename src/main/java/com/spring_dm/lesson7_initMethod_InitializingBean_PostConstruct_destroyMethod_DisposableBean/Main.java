package com.spring_dm.lesson7_initMethod_InitializingBean_PostConstruct_destroyMethod_DisposableBean;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
        Для того чтобы вызвать метод инициализации есть несколько способов:
        1. При помощи явного указания метода, в нашем случае это метод init().
            В этом случае обязательно нужно указать метод инициализации в xml файле. Пример №1 (ctx1).
        2. При помощи реализации интерфейса InitializingBean и переопределения метода afterPropertiesSet(),
            который будет служить в качестве метода инициализации.
            В этом случае в файле xml не нужно явно указывать какой метод будет служить для инициализации. Пример №2 (ctx2).
            Метод afterPropertiesSet() вызывается после вызова сеттеров.
            @PostConstruct - используется для обозначения метода, который должен быть выполнен сразу после создания объекта
            и завершения работы конструктора, но до того, как объект будет использован. Пример №3 (ctx3).
         */
        /*
            Для того чтобы вызвать метод деструктуризации есть несколько способов:
            1. При помощи явного указания метода, в нашем случае это метод destroyMethod().
            В этом случае обязательно нужно указать метод деструктуризации в xml файле. Пример №1 (ctx1).
            2. При помощи реализации интерфейса DisposableBean и переопределения метода destroy(),
            который будет служить в качестве метода деструктуризации.
            В этом случае в файле xml не нужно явно указывать какой метод будет служить для деструктуризации. Пример №2 (ctx2).
         */

//        GenericXmlApplicationContext ctx1 = new GenericXmlApplicationContext(
//                "lesson7_initMethod_InitializingBean_PostConstruct_destroyMethod_DisposableBean/app-context-initMethod.xml");
//        SimpleBean sb1 = getBean("simpleBean1", ctx1);
//        SimpleBean sb2 = getBean("simpleBean2", ctx1);
//        SimpleBean sb3 = getBean("simpleBean3", ctx1);
//        destroyExample("simpleBean1", ctx1);
//
//
//        GenericXmlApplicationContext ctx2 = new GenericXmlApplicationContext(
//                "lesson7_initMethod_InitializingBean_PostConstruct_destroyMethod_DisposableBean/app-context-InitializingBeanImpl.xml");
//        SimpleBeanWithInterface sb4 = getBeanWithinterface("simpleBean1", ctx2);
//        SimpleBeanWithInterface sb5 = getBeanWithinterface("simpleBean2", ctx2);
//        SimpleBeanWithInterface sb6 = getBeanWithinterface("simpleBean3", ctx2);
//        destroyExampleWithInterface("simpleBean1", ctx2);


        GenericXmlApplicationContext ctx3 = new GenericXmlApplicationContext(
                "lesson7_initMethod_InitializingBean_PostConstruct_destroyMethod_DisposableBean/app-context-initAnnotation.xml");
        //SimpleBeanWithAnnotation sb7 = getBeanWithAnnotation("simpleBeanWithAnnotation", ctx3);
        destroyExampleWithAnnotation("simpleBeanWithAnnotation", ctx3);

    }


    private static SimpleBean getBean(String beanName, GenericXmlApplicationContext ctx) {
        try {
            SimpleBean bean = (SimpleBean) ctx.getBean(beanName);
            System.out.println(bean);
            return bean;
        } catch (BeanCreationException e) {
            System.out.println("Error creating bean");
            return null;
        }
    }

    private static SimpleBeanWithInterface getBeanWithinterface(String beanName, GenericXmlApplicationContext ctx) {
        try {
            SimpleBeanWithInterface bean = (SimpleBeanWithInterface) ctx.getBean(beanName);
            System.out.println(bean);
            return bean;
        } catch (BeanCreationException e) {
            System.out.println("Error creating bean");
            return null;
        }
    }


    private static void destroyExample(String beanName, GenericXmlApplicationContext ctx) {
        SimpleBean bean = (SimpleBean) ctx.getBean(beanName);
        System.out.println("before call destroy");
        ctx.close();
        System.out.println("after call destroy");
    }

    private static void destroyExampleWithInterface(String beanName, GenericXmlApplicationContext ctx) {
        SimpleBeanWithInterface bean = (SimpleBeanWithInterface) ctx.getBean(beanName);
        System.out.println("before call destroy");
        ctx.close();
        System.out.println("after call destroy");
    }


    private static SimpleBeanWithAnnotation getBeanWithAnnotation(String beanName, GenericXmlApplicationContext ctx) {
        try {
            SimpleBeanWithAnnotation bean = (SimpleBeanWithAnnotation) ctx.getBean(beanName);
            System.out.println(bean);
            return bean;
        } catch (BeanCreationException e) {
            System.out.println("Error creating bean");
            return null;
        }
    }

    private static void destroyExampleWithAnnotation(String beanName, GenericXmlApplicationContext ctx) {
        SimpleBeanWithAnnotation bean = (SimpleBeanWithAnnotation) ctx.getBean(beanName);
        System.out.println("before call destroy");
        ctx.close();
        System.out.println("after call destroy");
    }
}
