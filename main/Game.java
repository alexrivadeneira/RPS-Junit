package com.company.main;
import com.company.main.Player;
import java.util.Scanner;

import java.util.ArrayList;

public class Game {

    boolean singlePlayerGame;
    public ArrayList<String> possibleMoves;

    public boolean isSinglePlayerGame() {
        return singlePlayerGame;
    }

    public void newGame(){
        System.out.println("Starting new game");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many players? (enter 1 or 2)");
        String numPlayers = scanner.nextLine();

        boolean validStart = false;

        while(validStart == false){
            if(numPlayers.equals("1")){
                singlePlayerGame = true;
                System.out.println("Starting single player game");
                validStart = true;
            } else if (numPlayers.equals("2")){
                singlePlayerGame = false;
                System.out.println("Starting two player game");
                validStart = true;
            } else {
                System.out.println("Enter either the digit 1 (single player) or 2 (two player)");
                numPlayers = scanner.nextLine();
            }
        }

        if(isSinglePlayerGame()){
            singlePlayerGame();
        } else {
            twoPlayerGame();
        }

    }

    public void singlePlayerGame(){
        System.out.println("playing single player game!!!");
        Player player1 = new Player("Bob");
        player1.makeMove(getMoveInput());

    }

    public void twoPlayerGame(){
        System.out.println("Two player game!");
    }

    public String makeComputerMove(){
        return "";
    }

    public String getMoveInput(){
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        String input = "";

        while(validInput == false){
            System.out.println("Enter rock, paper or scissor");
            input = scanner.nextLine().toLowerCase();
            if(input.equals("rock") || input.equals("scissor") || input.equals("paper")){
                validInput = true;
            }
        }

        return input;
    }

}
