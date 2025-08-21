package com.bobadilla.factory.examples;

public class ChessBoad extends Board{

    public ChessBoad(String[] players) {
        super(players);
    }

    // Creador concreto
    @Override
    Game createGame() {
        String[] players = getPlayers();
        String playerOne = "Blanco";
        String playerTwo = "Negro";

        if(players != null && players.length == 2){
            playerOne = players[0];
            playerTwo = players[1];
        }


        ChessGame game = new ChessGame(playerOne,playerTwo);
        return game;
    }
    
}
