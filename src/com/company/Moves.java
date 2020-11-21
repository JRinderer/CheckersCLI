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
    public boolean validMove(Board board, Piece piece) {
        //regular pieces can only move forward DO NOT ALLOW ABS on regular pieces
        //also need to check if position is empty
        int validX;
        int jmpY;
        if(piece.getStatus() <= 0){
            return false;
        }

        if(piece.getName().contains("K")){
            validX = Math.abs(this.startX - this.endX);
        }else{
            validX = (this.startX - this.endX);
        }

        int validY = Math.abs(this.startY - this.endY);

        int jmpX;

        int frwdMove = piece.getForwrdMove();
        //for king pieces we need to allow them to move back and forth otherwise we can use the pieces default movement
        if(piece.getName().contains("K")){
            jmpX = getJumpDirectX();
        }else{
            jmpX = endX + frwdMove;
        }
        //need to obtain the valid Y movement, this calculation is slightly different for each color so I've abstracted
        //it to another function.
        jmpY = getJumpDirectY(piece);

        int jumpMove = piece.getJumpMove();

        //regular piece movement validates the direction is correct... square comparison here is close but not exact
        if ((validX == frwdMove) && (validY == 1) && (!board.squares[endX][endY].getPiece().getColor().equals(piece.getColor()))) {
            return true;
        } else if ((validX == jumpMove) && (validY == 2) && (isSquareEmpty(board, endX, endY))) {
            //need to change - 1 to + 1 when white is moving
            boolean x = pieceJumped(board, piece, (jmpX), (jmpY));
            //boolean x = pieceJumped(board,piece,(endX-1),(endY-1));
            if (x) {
                board.removePieceOnSpace(jmpX, jmpY);
                return x;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    public int getJumpDirectX(){
        int jmpX = 0;
        if(this.startX < this.endX){
            jmpX = this.endX - 1;
        }else{
            jmpX = this.endX + 1;
        }
        return jmpX;
    }

    public int getJumpDirectY(Piece piece){
        int jmpY = 0;

        if(piece.getName().contains("K")){
            if(this.startY<this.endY){
                jmpY = Math.abs(endY-1);
                return jmpY;
            }else{
                jmpY = Math.abs(endY+1);
                return jmpY;
            }
        }

        if(piece.getColor().contains("R")){
            if(this.startY < this.endY){
                jmpY = Math.abs(endY-1);
            }else{
                jmpY = Math.abs(endY+1);
            }
        }else{
            if(this.startY < this.endY){
                jmpY = Math.abs(endY-1);
            }else{
                jmpY = Math.abs(endY + 1);
            }
        }
        return jmpY;

    }

    public boolean isSquareEmpty(Board board, int x, int y) {
        if (board.squares[x][y].getPiece().getColor().equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isKingRow(Piece piece){
        if(piece.getxCord()==piece.getKingRow()){
            return true;
        }else{
            return false;
        }
    }

    public boolean pieceJumped(Board board, Piece atckPiece, int x, int y) {
        Piece jmpdPiece = board.squares[x][y].piece;
        if ((!jmpdPiece.getColor().equals("")) && (!jmpdPiece.getColor().equals(atckPiece.getColor()))) {
            jmpdPiece.setStatus(0);
            return true;
        } else {
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
