package com.cts.handson6.observer.interfaces.impl;

import com.cts.handson6.observer.Message;
import com.cts.handson6.observer.interfaces.Observer;
import com.cts.handson6.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

/*
    A Subject implementation for Message publishing
 */

public class MessagePublisher implements Subject {
    private final List<Observer> observers;
    private String state;

    public MessagePublisher() {
        this.observers = new ArrayList<>();
        this.state = "OldState";
    }

    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observers.removeIf(o -> observer.equals(o));
    }

    public void setState(String state) {
        String oldState = this.state;
        this.state = state;
        Message message = new Message("State changed from " + oldState + " to " + this.state);
        this.notifyUpdate(message);
    }

    @Override
    public void notifyUpdate(Message message) {
        this.observers.stream()
                .forEach(observer -> observer.update(message));
    }
}
