package com.rounie.spring5.five;

import com.rounie.spring5.five.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  //使用注解方式创建对象
public class BookService {
    @Autowired  //注入BookDao对象
    private BookDao bookDao;



    //添加
    public void addBook(Book book)
    {
        bookDao.add(book);
    }

    //更新
    public void updateBook(Book book)
    {
        bookDao.update(book);
    }


    //删除
    public void delete(String id)
    {
        bookDao.delete(id);
    }

    //查询
    public int findCount()
    {
        return bookDao.selectCount();
    }

    public Book query(String id)
    {
        return bookDao.findBookInfo(id);
    }

    public List<Book> findAllBook()
    {
        return bookDao.findALlBook();
    }

    public void addBatch(List<Object[]> args)
    {
        bookDao.batchAddBook(args);
    }

    public void batchUpdate(List<Object[]> batchArgs)
    {
        bookDao.batchUpdateBook(batchArgs);
    }

}
