package com.rounie.spring5.Proxy;

public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public void update() {
        System.out.println("update 被调用了......");
    }
}
