package com.rounie.spring5.aopannno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class PersonUser {

    @Before(value="execution(* com.rounie.spring5.aopannno.User.add(..))")
    public void before()
    {
        System.out.println("persoon before...");
    }
}
