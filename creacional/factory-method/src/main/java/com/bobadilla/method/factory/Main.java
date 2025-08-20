package com.bobadilla.method.factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        printMessage(new JSONMessageCreator());
        printMessage(new TextMessageCreator());
    }


    public static void printMessage(MessageCreator creator){
        Message msg = creator.getMessage();
        System.out.println(msg);
    }
}