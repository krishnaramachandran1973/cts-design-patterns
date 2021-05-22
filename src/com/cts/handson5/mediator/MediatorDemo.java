package com.cts.handson5.mediator;

import com.cts.handson5.mediator.interfaces.impl.BasicUser;
import com.cts.handson5.mediator.interfaces.impl.ChatMediator;
import com.cts.handson5.mediator.interfaces.impl.PremiumUser;

import java.util.Arrays;

public class MediatorDemo {
    public static void main(String[] args) {

        ChatMediator chatMediator = new ChatMediator();
        Arrays.asList(new BasicUser("Name1", chatMediator),
                new BasicUser("Name2", chatMediator),
                new BasicUser("Name3", chatMediator),
                new BasicUser("Name4", chatMediator),
                new BasicUser("Name5", chatMediator),
                new BasicUser("Name6", chatMediator),
                new PremiumUser("Name7", chatMediator),
                new PremiumUser("Name8", chatMediator))
                .forEach(iUser -> chatMediator.addUser(iUser));

        BasicUser krishna = new BasicUser("Krishna", chatMediator);
        krishna.sendMessage("Hello There");
    }
}
