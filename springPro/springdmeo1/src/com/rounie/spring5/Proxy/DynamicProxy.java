package com.rounie.spring5.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class DynamicProxy {
    public static void main(String[] args)
    {
        Class[] interfaces={UserDao.class};
        UserDao useedao=new UserDaoImpl();
        UserDao dao=(UserDao)Proxy.newProxyInstance(DynamicProxy.class.getClassLoader(),interfaces,new UserDaoProxy(useedao));
        int result=dao.add(1,2);
        System.out.println("result:"+result);
        dao.update();
    }
}


class UserDaoProxy implements InvocationHandler
{
    private Object obj;

    public UserDaoProxy(Object obj)
    {
        this.obj=obj;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println("方法之前执行...."+method.getName()+" :传递的参数..."+ Arrays.toString(args));

        //被增强方法执行
        Object res=method.invoke(obj,args);

        //方法之后
        System.out.println("方法调用之后....."+obj);
        return res;
    }
}