package com.bobadilla.method.factory;

public abstract class Message {
    
    public abstract String getContent();

    public void addDefaultHeaders(){

    }

    public void encrypt(){
        System.out.println("Encriptando");
    }

    


}
