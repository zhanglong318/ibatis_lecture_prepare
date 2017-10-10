package com.test.lecture.reflection;

import java.lang.reflect.Method;

public class DumpMethods {

    public static void main(String args[]) throws Exception {
        Class<?> classType = Class.forName("java.lang.String");

        Method methods[] = classType.getDeclaredMethods();

        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }
    }
}