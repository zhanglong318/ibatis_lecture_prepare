package com.test.lecture.composite;

public class Client {

    public static void main(String[] args) {

        Component com = new Leaf();
        Component com2 = new Leaf();

        Composite composite = new Composite();

        composite.add(com);
        composite.add(com2);

        composite.doSomething();
    }
}
