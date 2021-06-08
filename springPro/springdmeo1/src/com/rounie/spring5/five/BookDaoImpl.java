package com.rounie.spring5.five;

import com.rounie.spring5.five.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository  //使用注解方式创建对象
public class BookDaoImpl implements BookDao {
    //注入JDBCTemplate对象
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //增加
    @Override
    public void add(Book book) {
        String sql = "insert into t_book values(?,?,?)";
        Object[] args = {book.getUserId(), book.getUsername(), book.getUsatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void update(Book book) {
        String sql="update t_book set username=?,ustatus=? where user_id=?";
        Object[] args={book.getUsername(), book.getUsatus(),book.getUserId()};  //需要注意：这里参数顺序与上面三个问号相对应
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void delete(String id) {
        String sql = "delete from t_book where user_id=?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from t_book";
        //queryForObject方法中：第一个参数代表--sql语句；第二个参数代表--返回类型class
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    //查询返回对象
    @Override
    public Book findBookInfo(String id) {
        String sql = "select * from t_book where user_id=?";
        //调用方法
        /*
	    queryForObject方法中：
		第一个参数：sql语句
		第二个参数：RowMapper 是接口，针对返回不同类型数据，使用这个接口里面 实现类 完成数据封装
		第三个参数：sql 语句值
        */
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    @Override
    public List<Book> findALlBook() {
        String sql = "select * from t_book";
        //调用方法
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }


    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql = "insert into t_book values(?,?,?)";
        //batchUpdate方法 第一个参数：sql语句		第二个参数：List集合，添加多条记录数据
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    //批量修改(同批量添加一样，调用同一个方法)
    @Override
    public void batchUpdateBook(List<Object[]> batchArgs) {
        String sql = "update t_book set username=?,ustatus=? where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }



}
