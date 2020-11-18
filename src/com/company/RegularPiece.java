package com.company;

public class RegularPiece implements Piece {
    //Fixing git
    //an empty piece is red is 1 white 2
    String color;
    int xCord;
    int yCord;
    String name;
    Moves mov;
    int forwrdMove;
    int jumpMove;
    int id;
    int status;
    public static int counter=0;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getJumpMove() {
        return jumpMove;
    }

    public void setJumpMove(int jumpMove) {
        this.jumpMove = jumpMove;
    }

    public String getColor() {
        return color;
    }

    public int getForwrdMove() {
        return forwrdMove;
    }

    public void setForwrdMove(int forwrdMove) {
        this.forwrdMove = forwrdMove;
    }

    public void setColor(String color) {
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

    public RegularPiece(String col, int forwrdMove, int jumpMove){
        this.color=col;
        this.setId(counter);
        this.forwrdMove = forwrdMove;
        this.jumpMove = jumpMove;
        this.status=1;
        counter++;

        }

    public RegularPiece(){
        this.setId(counter);
        counter++;
    }

    public boolean move(Board board, int x, int y){
        int curX = this.xCord;
        int curY = this.yCord;
        mov = new Moves(this, x,y);
        boolean valid = mov.validMove(board,this);
        //if the move is valid and the piece isn't dead, dead being 0
        if(valid && this.status>0){
            this.xCord = x; //set the X coordinates so the pieces position is updated
            this.yCord = y; //set the Y coordinates so the pieces position is updated
            board.setPieceOnSpace(this,this.xCord,this.yCord); //move the piece on the board
            board.removePieceOnSpace(curX,curY); //remove the piece from it's old position
        }

        return valid; //return valid so the game knows the piece was or wasn't valid

    }

    public void convertToKing(){

    }

    public boolean isJump(Piece self,int x, int y){

        return true;
    }
}
