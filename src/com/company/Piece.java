package com.company;

public interface Piece {
    //Fixing git
    public boolean move(Board board, int x, int y);
    public boolean isJump(Piece pce, int x, int y);
    public String getName();
    public void setName(String name);
    public int getId();
    public int getxCord();
    public int getyCord();


}
