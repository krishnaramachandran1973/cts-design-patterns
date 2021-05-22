package com.cts.handson6.observer.interfaces.impl;

import com.cts.handson6.observer.Message;
import com.cts.handson6.observer.interfaces.Observer;
import com.cts.handson6.observer.interfaces.Subject;

/*
    A MessagePublisher subscriber
 */

public class MessageSubscriberTwo implements Observer {

    private final Subject subject;

    public MessageSubscriberTwo(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(Message message) {
        System.out.println("MessageSubscriberTwo :: " + message.getMessageContent());
    }
}
