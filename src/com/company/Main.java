package com.company;

public class Main {
    public static void main(String[] args){
        Board myBoard = new Board();
        myBoard.showBoard();

        //myBoard.setPieceOnSpace("r",3,1);
        System.out.println("=====================================");
        myBoard.showBoard();

        RegularPiece myPiece = new RegularPiece();
        myPiece.move(3,4);

    }
}
