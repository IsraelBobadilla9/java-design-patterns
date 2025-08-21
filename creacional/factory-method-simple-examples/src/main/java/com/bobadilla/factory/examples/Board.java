package com.bobadilla.factory.examples;


// Creador 
public abstract class Board {

    private Game game;
    private String[] players;

    public Board(String[] players){
        this.players = players;
    }

    // metodo plantilla
    public void initialize(){
    
        this.game = createGame();
        game.start();
    
    }



    // las clases hijas lo van a definir
    // este es el metodo factory
    abstract Game createGame();

    public String[] getPlayers() {
        return players;
    }

    

}
