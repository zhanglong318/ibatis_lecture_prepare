package com.test.lecture.observer;

public class Client {

    public static void main(String[] args) {

        Subject subject = new ConcreteSubject();

        Observer observer = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();

        subject.addObserver(observer);
        subject.addObserver(observer2);

        subject.notifyObservers();
    }
}
