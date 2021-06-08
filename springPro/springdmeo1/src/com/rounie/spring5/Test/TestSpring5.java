package com.rounie.spring5.Test;

import com.rounie.spring5.Books;
import com.rounie.spring5.Orders;
import com.rounie.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

public class TestSpring5 {
    @Test
    public void testAdd()
    {
        //1、加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");  //必须在sre下
        //获取配置文件对象
//        User user=context.getBean("user", User.class);
//        Orders od=context.getBean("orders", Orders.class);
//        System.out.println(user);
//        user.add();
//        System.out.println(od);
//        od.soutinfo();
        Books book=context.getBean("book",Books.class);
//        context.getBean("userService",userService.class)
//        book.setName("matlab");
//        book.setPrice(30);
        System.out.println(book);
        System.out.println(book.getName());
        System.out.println(book.getPrice());
        System.out.println(book.getAuthor());

    }
}
