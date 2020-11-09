package com.company;

public interface Piece {
    public void move(int x, int y);
    public boolean isJump(Piece pce, int x, int y);
    public String getName();
    public void setName(String name);
    public int getId();

}
