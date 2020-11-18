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

//test
    public boolean validMove(Board board, Piece piece){
        //regular pieces can only move forward DO NOT ALLOW ABS on regular pieces
        //also need to check if position is empty
        int validX = (this.startX - this.endX);
        int validY = Math.abs(this.startY - this.endY);

        int frwdMove = piece.getForwrdMove();
        int jmpX = endX + frwdMove;
        int jmpY = Math.abs(endY + frwdMove);
        int jumpMove = piece.getJumpMove();

        //regular piece movement validates the direction is correct... square comparison here is close but not exact
        if((validX ==frwdMove) && (validY == 1) && (!board.squares[endX][endY].getPiece().getColor().equals(piece.getColor()))){
            return true;
        }else if((validX == jumpMove) && (validY == 2) && (isSquareEmpty(board,endX,endY)) ){
            //need to change - 1 to + 1 when white is moving
            boolean x = pieceJumped(board,piece,(jmpX),(jmpY));
            //boolean x = pieceJumped(board,piece,(endX-1),(endY-1));
            if(x){
                board.removePieceOnSpace(jmpX,jmpY);
                return x;
            }else{
                return false;
            }
        }else{
            return false;
        }

        /*if(validX - validY == 0){
            return true;
        }else{
            return false;
        }*/
    }

    public boolean isSquareEmpty(Board board, int x, int y){
        if(board.squares[x][y].getPiece().getColor().equals("")){
            return true;
        }else{
            return false;
        }
    }

    public boolean pieceJumped(Board board, Piece atckPiece, int x, int y){
        Piece jmpdPiece = board.squares[x][y].piece;
        if((!jmpdPiece.getColor().equals("")) && (!jmpdPiece.getColor().equals(atckPiece.getColor()))){
            jmpdPiece.setStatus(0);
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
