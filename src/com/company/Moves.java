package com.company;

public class Moves {
    int start;
    int end;
    Piece piece;

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public Moves(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
