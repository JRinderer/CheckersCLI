package com.company;

public class RegularPiece implements Piece {
    //Fixing git
    //an empty piece is red is 1 white 2
    int color;
    int xCord;
    int yCord;
    String name;
    Moves mov;
    int id;
    public static int counter=0;



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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Moves getMov() {
        return mov;
    }

    public void setMov(Moves mov) {
        this.mov = mov;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RegularPiece(int col){
        this.color=col;
        this.setId(counter);
        counter++;

        }

    public RegularPiece(){
        this.setId(counter);
        counter++;
    }

    public void move(int x, int y){
        mov = new Moves(this, x,y);


    }

    public boolean isJump(Piece self,int x, int y){

        return true;
    }
}
