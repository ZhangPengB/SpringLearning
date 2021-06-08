package com.rounie.spring5;

/*
* 使用有参构造注入
* */
public class Orders {

    public String name;
    public String address;

    public Orders(String sname, String address) {
        this.name = sname;
        this.address = address;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void soutinfo()
    {
        System.out.println(name);
        System.out.println(address);
    }

}
