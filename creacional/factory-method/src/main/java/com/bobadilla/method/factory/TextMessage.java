package com.bobadilla.method.factory;

public class TextMessage extends Message{
    
    @Override
    public String getContent(){
        return "text";
    }

    @Override
    public String toString() {
        return "TextMessage []";
    }

    

}
