package com.bobadilla.estructural.decorator;

public class Main {
    public static void main(String[] args) {
        Message m = new TextMessage("Mensaje sin decorador <FORCE>");
        System.out.println(m.getContent());


        Message decorator = new HtmlEncodedMessage(m);
        System.out.println(decorator.getContent());

        Message decoratorBase = new Base64EncodedMessage(m);
        System.out.println(decoratorBase.getContent());
    }
}