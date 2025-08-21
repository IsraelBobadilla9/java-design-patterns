package com.bobadilla.factory.examples;

public class Main {
    public static void main(String[] args) {
        String[] chessPlayers = {"israel","jose"};
        Board chessBoard = new ChessBoad(chessPlayers);

        chessBoard.initialize();

        String[] solitairePlayer = new String[]{"buenas"};
        Board solitBoard = new SolitaireBoard(solitairePlayer);
        solitBoard.initialize();

    }
}