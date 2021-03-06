package com.test.lecture.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


public class Client {

    public static void main(String[] args) throws Throwable {
        RealSubject rs = new RealSubject();
        InvocationHandler ds = new DynamicSubject(rs);
        Class<?> cls = rs.getClass();

        Subject subject = (Subject) Proxy.newProxyInstance(
                cls.getClassLoader(), cls.getInterfaces(), ds);

        subject.request();
    }
}
