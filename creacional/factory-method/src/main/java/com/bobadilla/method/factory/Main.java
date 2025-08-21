package com.bobadilla.method.factory;

public class Main {
    public static void main(String[] args) {
        printMessage(new JSONMessageCreator());
        System.out.println();
        System.out.println();
        printMessage(new TextMessageCreator());
    }


    public static void printMessage(MessageCreator creator){
        Message msg = creator.getMessage();
        System.out.println(msg);
    }
}