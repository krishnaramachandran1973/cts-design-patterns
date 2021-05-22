package com.cts.handson6.observer.interfaces;

import com.cts.handson6.observer.Message;

/*
    Subject interface for Observers to subscribe
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyUpdate(Message message);
}
