package com.test.lecture.composite2;

import java.util.List;

public class Leaf implements Component {

    public void add(Component component) {

    }

    public void doSomething() {
        System.out.println("Leaf");
    }

    public List<Component> getAll() {
        return null;
    }

    public void remove(Component component) {

    }

}
