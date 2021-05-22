package com.cts.handson5.mediator.interfaces.impl;

import com.cts.handson5.mediator.interfaces.IChatMediator;
import com.cts.handson5.mediator.interfaces.IUser;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {
    private final List<IUser> users;

    public ChatMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(IUser iUser) {
        this.users.add(iUser);
    }

    @Override
    public void sendMessage(String message) {
        this.users.stream()
                .forEach(user -> user.receiveMessage(message));
    }
}
