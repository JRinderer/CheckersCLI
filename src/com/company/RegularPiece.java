package com.company;

public class RegularPiece implements Piece {
    int color;
    int xCord;
    int yCord;
    Moves mov;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getxCord() {
        return xCord;
    }

    public void setxCord(int xCord) {
        this.xCord = xCord;
    }

    public int getyCord() {
        return yCord;
    }

    public void setyCord(int yCord) {
        this.yCord = yCord;
    }

    public RegularPiece(){

    }

    public void move(int x, int y){
        mov = new Moves();

    }

    public boolean isJump(Piece self,int x, int y){

        return true;
    }
}
