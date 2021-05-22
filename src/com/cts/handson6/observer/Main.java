package com.cts.handson6.observer;

import com.cts.handson6.observer.interfaces.Observer;
import com.cts.handson6.observer.interfaces.Subject;
import com.cts.handson6.observer.interfaces.impl.MessagePublisher;
import com.cts.handson6.observer.interfaces.impl.MessageSubscriberOne;
import com.cts.handson6.observer.interfaces.impl.MessageSubscriberThree;
import com.cts.handson6.observer.interfaces.impl.MessageSubscriberTwo;

/*
    Testing Observer pattern
 */
public class Main {
    public static void main(String[] args) {
        Subject messagePublisher = new MessagePublisher();
        Observer observer1 = new MessageSubscriberOne(messagePublisher);
        Observer observer2 = new MessageSubscriberTwo(messagePublisher);
        Observer observer3 = new MessageSubscriberThree(messagePublisher);

        messagePublisher.notifyUpdate(new Message("First Message"));

        System.out.println("-------------------------------------------");

        System.out.println("MessageSubscriberOne unsubscribed");
        messagePublisher.detach(observer1);

        messagePublisher.notifyUpdate(new Message("Second Message"));

        System.out.println("-------------------------------------------");

        ((MessagePublisher) messagePublisher).setState("NewState");

    }
}
