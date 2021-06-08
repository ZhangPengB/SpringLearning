package com.rounie.spring5.five.entity;


//数据库表t_book 对应的实体类，一般数据库中每一个表格对应一个实体类
public class Book {
    private String userId;
    private String username;
    private String usatus;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsatus() {
        return usatus;
    }

    public void setUsatus(String usatus) {
        this.usatus = usatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", usatus='" + usatus + '\'' +
                '}';
    }
}
