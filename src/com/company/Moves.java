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


    public boolean validMove(Piece piece){
        int validX = Math.abs(this.startX - this.endX);
        int validY = Math.abs(this.startY - this.endY);

        if(validX - validY == 0){
            return true;
        }else{
            return false;
        }
    }

    public void pieceJumped(){

    }



    public Moves(Piece piece, int endX, int endY) {
        this.startX = piece.getxCord();
        this.startY = piece.getyCord();
        this.endX = endX;
        this.endY = endY;
        this.piece = piece;
    }
}
