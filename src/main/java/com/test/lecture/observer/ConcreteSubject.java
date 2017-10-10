package com.test.lecture.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    public List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        this.observers.forEach(observer -> {
            observer.update();
        });
    }
}