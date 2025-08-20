package com.bobadilla.method.factory;

public class JSONMessageCreator extends MessageCreator{

    @Override
    public Message createMessage() {
        // TODO Auto-generated method stub
        return new JSONMessage();
    }
    
}
