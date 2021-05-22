package com.cts.handson6.observer;

/*
    The Message object that is published by the Subject
 */

public class Message {
    private final String messageContent;

    public Message(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getMessageContent() {
        return messageContent;
    }
}
