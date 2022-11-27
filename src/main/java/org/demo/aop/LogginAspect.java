package org.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {

//    @Pointcut(value = "execution(* org.demo.controller.StudentController.*(..))")
//    public void test(){
//
//    }
//    @Before("test()")
//    public void login(JoinPoint jp){
//        Signature signature = jp.getSignature();
//        System.out.println("Loggin is called "+signature);
//
//    }

    @Around(value = "execution(* org.demo.controller.StudentController.*(..))")
    public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
        //System.out.println("Around executed");
        long start = System.currentTimeMillis();
        Object object = pjp.proceed();
        long end = System.currentTimeMillis();
        long t =end-start;
        String signature = pjp.getSignature().toString();
        System.out.println("Time consumed for "+signature+" is "+t+"ms");

        return object;
    }
}
