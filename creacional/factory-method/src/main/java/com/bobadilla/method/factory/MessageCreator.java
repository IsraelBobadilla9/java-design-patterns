package com.bobadilla.method.factory;
// normalmente son clases abstractas
public abstract class MessageCreator {
    

    public Message getMessage(){
        Message message = createMessage();
        System.out.println("Load more data");
        message.addDefaultHeaders();
        message.encrypt();
        
        return message;
    }

    // Factory Method, como es de tipo abstracto se le delega a las clases hijas el comportamiento
    public abstract Message createMessage();


}
