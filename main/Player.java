package com.company.main;

import java.util.ArrayList;

public class Player {

    private boolean win;
    private ArrayList<String> moves;
    private String name;

    public Player(String playerName){
        win = false;
        moves = new ArrayList<>();
        name = playerName;
    }

    public String getName() {
        return name;
    }

    public void makeMove(String input){
        moves.add(input.toLowerCase());
    }


    public ArrayList<String> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<String> moves) {
        this.moves = moves;
    }

    public boolean getWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }




}
