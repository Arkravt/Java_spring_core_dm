package com.spring_dm.lesson8_aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class MyLogger {

    /*
    Метод loggerPointcut() является Pointcut`ом.
    Здесь в аннотации @Pointcut мы указываем в какое место программы мы будем внедрять наш код.
    Если в выражении указаны звездочки или точки, это значит вместо них может быть любое значение.

    Метод logBefore(JoinPoint joinPoint) является Advice`ом. В параметре этого метода указан target элемент(joinPoint).
    Этот метод будет вызван в нужное время везде где указано в аннотации @Pointcut над методом loggerPointcut().

    Выражение которое указано в @Pointcut можно сразу указывать в метод @Before минуя создания доп метода loggerPointcut().
    Пример: метод LogAfter(Object retVal).

    Метод LogAfter(Object retVal) принимает параметр который возвращает метод getName() в классе StudentJava.
    Имя этого параметра должно совпадать со значением которое указано в аннотации @AfterReturning в параметре "returning".
     */

    //@Pointcut("execution(public void .getMessage())")
    @Pointcut("execution(* * .getMessage(..))")
    public void loggerPointcut() {}

    //@Before("execution(public void .getMessage())")
    //@Before(value = "execution(* * .getMessage(..))")
    @Before("loggerPointcut()")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("This is myLogger.log");
        System.out.println(joinPoint.getSignature());
    }


    @AfterReturning(value = "execution(public String getName())", returning = "reVal")
    public void LogAfter(Object retVal) {
        System.out.println("----------------------------------");
        System.out.println(retVal);
        System.out.println("----------------------------------");
    }

}
