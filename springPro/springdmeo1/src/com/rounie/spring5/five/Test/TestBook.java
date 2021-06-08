package com.rounie.spring5.five.Test;

import com.rounie.spring5.five.BookService;
import com.rounie.spring5.five.entity.Book;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBook {
    @Test
    public void testJdbcTemplate()
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beanjdbc.xml");

        BookService bookService = context.getBean("bookService", BookService.class);  //默认bean id 以首字母小写方式加入

//        Book book1=new Book();
//        book1.setUserId("1");
//        book1.setUsername("java");
//        book1.setUsatus("a");

//
//        Book book2=new Book();
//        book2.setUserId("2");
//        book2.setUsername("C++");
//        book2.setUsatus("b");

//        Book book3=new Book();
//        book3.setUserId("4");
//        book3.setUsername("js");
//        book3.setUsatus("g");

//        Book book4=new Book();
//        book4.setUserId("5");
//        book4.setUsername("goes");
//        book4.setUsatus("e");


//        bookService.updateBook(book3);
//        bookService.delete("4");
//        System.out.println(bookService.findCount());
//        System.out.println(bookService.query("1"));
//        System.out.println(bookService.findAllBook());

        //批量添加测试
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"java","b","3"};
        Object[] o2 = {"c++","c","4"};

        batchArgs.add(o1);
        batchArgs.add(o2);
        //调用批量添加
//        bookService.addBatch(batchArgs);
        bookService.batchUpdate(batchArgs);

    }

}
