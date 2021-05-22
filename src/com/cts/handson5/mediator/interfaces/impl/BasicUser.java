package com.cts.handson5.mediator.interfaces.impl;

import com.cts.handson5.mediator.interfaces.IChatMediator;
import com.cts.handson5.mediator.interfaces.IUser;

public class BasicUser implements IUser {
    private final IChatMediator iChatMediator;
    private final String name;

    public BasicUser(String name, IChatMediator iChatMediator) {
        this.name = name;
        this.iChatMediator = iChatMediator;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + " received: " + message);
    }

    @Override
    public void sendMessage(String message) {
        this.iChatMediator.sendMessage(message);
    }
}
