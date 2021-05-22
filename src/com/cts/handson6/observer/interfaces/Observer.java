package com.cts.handson6.observer.interfaces;

import com.cts.handson6.observer.Message;

/*
    Observer interface for Observers
 */
public interface Observer {
    void update(Message message);
}
