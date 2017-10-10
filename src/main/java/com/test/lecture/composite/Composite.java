package com.test.lecture.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private List<Component> list = new ArrayList<>();

    public void add(Component component) {
        list.add(component);
    }

    public void remove(Component component) {
        list.remove(component);
    }

    public List<Component> getAll() {
        return list;
    }

    public void doSomething() {
        for (Component com : list) {
            com.doSomething();
        }
    }

}
