package com.bobadilla.method.factory;

public class TextMessageCreator extends MessageCreator{

    @Override
    public Message createMessage() {
        System.out.println("Call createMessage from textmessagecreator");
        return new TextMessage();
    }
    
}
