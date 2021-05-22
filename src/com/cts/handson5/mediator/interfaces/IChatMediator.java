package com.cts.handson5.mediator.interfaces;
/*
    Mediator interface
 */
public interface IChatMediator {
    void addUser(IUser iUser);
    void sendMessage(String message);
}
