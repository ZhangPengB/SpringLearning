package com.rounie.spring5.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test


    public void testbean()
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean3.xml");

        Emp emp=context.getBean("emp",Emp.class);

        emp.add();
    }

}
