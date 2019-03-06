package com.test.Advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resources;

/**
 *
 */

@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.test.dao.daoImpl.*Impl.*(..))")
    public void po(){}

    @Before("MyAdvice.pc()")
    public void before(){
        System.out.println();
    }
}
