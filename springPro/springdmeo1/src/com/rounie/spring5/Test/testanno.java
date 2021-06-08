package com.rounie.spring5.Test;


import com.rounie.spring5.aopannno.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testanno {
    @Test
    public void test()
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beanano.xml");

        User user=context.getBean("user",User.class);  //获取被增强对象
        user.add();
    }
}
