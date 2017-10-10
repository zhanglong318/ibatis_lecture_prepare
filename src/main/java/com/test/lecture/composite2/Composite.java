package com.test.lecture.composite2;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private List<Component> list = new ArrayList<>();

    public void add(Component component) {
        list.add(component);
    }

    public void doSomething() {
        this.list.forEach(comp -> {
            comp.doSomething();
        });
    }

    public List<Component> getAll() {
        return list;
    }

    public void remove(Component component) {
        list.remove(component);
    }
}
