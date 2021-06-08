package com.rounie.spring5.aopannno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect   //生成代理对象
@Order(2)
public class UserProxy {

    //切入点抽取
    @Pointcut(value = "execution(* com.rounie.spring5.aopannno.User.add(..))")
    public void pointdemo()
    {

    }

    @Before(value="pointdemo()")  //相同切入点抽取使用
    public void before()
    {
        System.out.println("before...");
    }
}
