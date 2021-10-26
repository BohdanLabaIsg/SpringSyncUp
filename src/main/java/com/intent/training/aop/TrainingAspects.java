package com.intent.training.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class TrainingAspects {

    @Pointcut("execution(public * *respond(..))")
    private void respondPointcut() {
        // nothing here
    }

    @Pointcut("within(com.intent.training.entity..*)")
    private void packagePointcut() {
        // nothing here
    }

    @Pointcut("@annotation(com.intent.training.aop.Marker)")
    private void annotationPointcut() {
        // nothing here
    }

    @Pointcut("args(String, Long)")
    private void argsPointcut() {

    }

    @Pointcut("bean(*Robot)")
    private void beanPointcut() {

    }

    @Before("beanPointcut()")
    public void beanAdvice() {
        System.out.println("pointcut triggred");
    }
//    @Before("packagePointcut()")
//    public void packageAdvice(JoinPoint joinPoint) {
//        System.out.println("package triggered !!! : " + joinPoint.getSignature().getDeclaringType());
//    }
//
//    @Before("respondPointcut() && args(String, java.util.Date)")
//    public void respondAdvice(JoinPoint joinPoint) {
//        System.out.println("respond triggered !!! : " + joinPoint.getArgs());
//    }

//    @AfterReturning(pointcut = "respondPointcut() && args(String, java.util.Date)", returning = "response")
//    public void respondAfterAdvice(JoinPoint joinPoint, Object response) {
//        System.out.println("respond triggered !!! : " + joinPoint.getSignature().getDeclaringType());
//        System.out.println("::: " + response);
//    }

    @Around("respondPointcut() && args(value0, value1)")
    public void respondAdvice(ProceedingJoinPoint point, String value0, Date value1) throws Throwable {
        System.out.println("Method begin");
        System.out.println(value0);
        System.out.println(value1);

        Object proceed = point.proceed();

        System.out.println("Method end: " + proceed);
    }

}
