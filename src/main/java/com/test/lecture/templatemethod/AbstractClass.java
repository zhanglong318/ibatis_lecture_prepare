package com.test.lecture.templatemethod;

abstract public class AbstractClass {

    public void template() {
        this.method1();
        this.method2();
        this.method3();
    }

    abstract public void method1();

    abstract public void method2();

    abstract public void method3();
}