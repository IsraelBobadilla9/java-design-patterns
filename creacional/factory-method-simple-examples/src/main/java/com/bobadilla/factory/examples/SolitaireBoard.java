package com.bobadilla.factory.examples;

public class SolitaireBoard extends Board{

    public SolitaireBoard(String[] players) {
        super(players);
    }

    @Override
    Game createGame() {
        String[] players = getPlayers();
        String player = "jugador";
        if(players != null && players.length > 0){
            player = players[0];
        }
        SolitaireGame game = new SolitaireGame(player);
        return game;
    }
    
}
