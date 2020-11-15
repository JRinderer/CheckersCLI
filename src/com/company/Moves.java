package com.company;

public class Moves {
    //Fixing git
    int startX;
    int startY;
    int endX;
    int endY;
    Piece piece;

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public Piece getPiece() {

        return piece;
    }

    public void setPiece(Piece piece) {

        this.piece = piece;
    }


    public boolean validMove(Board board, Piece piece){
        //regular pieces can only move forward DO NOT ALLOW ABS on regular pieces
        int validX = (this.startX - this.endX);
        int validY = Math.abs(this.startY - this.endY);


        int frwdMove = piece.getForwrdMove();

        //regular piece movement
        if((validX ==frwdMove) && (validY == 1)){
            return true;
        }else{
            return false;
        }

        /*if(validX - validY == 0){
            return true;
        }else{
            return false;
        }*/
    }

    public boolean pieceJumped(Board board, Piece atckPiece, int x, int y){
        Piece jmpdPiece = board.squares[x][y].piece;
        if((!jmpdPiece.getColor().equals("") && (!jmpdPiece.getColor().equals(atckPiece.getColor())))){
            return true;
        }else{
            return false;
        }

    }



    public Moves(Piece piece, int endX, int endY) {
        this.startX = piece.getxCord();
        this.startY = piece.getyCord();
        this.endX = endX;
        this.endY = endY;
        this.piece = piece;
    }
}
