package com.test.lecture.composite2;

import java.util.List;

public interface Component {

    void doSomething();

    void add(Component component);

    void remove(Component component);

    List<Component> getAll();
}
