package com.rounie.spring5.five;

import com.rounie.spring5.five.entity.Book;

import java.util.List;

public interface BookDao {
    //添加方法
    void add(Book book);

    void update(Book book);

    void delete(String id);

    int selectCount();

    Book findBookInfo(String id);

    List<Book> findALlBook();

    void batchAddBook(List<Object[]> batchArgs);

    void batchUpdateBook(List<Object[]> batchArgs);
}
