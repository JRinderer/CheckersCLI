package com.company;

import java.util.ArrayList;

public class Player {
    boolean turn;
    String color;

    public boolean isTurn() {
        return turn;
    }

    public static Player whosTurn(ArrayList<Player> players){
        for(Player plyr : players){
            if(plyr.isTurn()){
                return plyr;
            }
        }
        return null;
    }

    public static void flipTurn(ArrayList<Player> players){
        for(Player plyr : players){
            if(!plyr.isTurn()){
                plyr.setTurn(true);
            }
        }
    }


    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Player(boolean turn, String color) {
        this.turn = turn;
        this.color = color;
    }
    public Player(){

    }
}
