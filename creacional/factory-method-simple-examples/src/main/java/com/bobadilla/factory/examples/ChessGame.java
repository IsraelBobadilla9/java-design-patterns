package com.bobadilla.factory.examples;

public class ChessGame implements Game{

    private String playerOne;
    private String playerTwo;
    


    public ChessGame(String playerOne, String playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }



    @Override
    public void start() {
        System.out.println("Inicia el juego de ajedrez...");
    }
    
}
