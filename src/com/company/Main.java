package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    //Fixing git
    public static void main(String[] args){
        Board myBoard = new Board();
        myBoard.showBoard();

        System.out.println("=====================================");

        ArrayList<Piece> currentPieces = new ArrayList<>();
        currentPieces = myBoard.getPieces();
        for(Piece p : currentPieces){
            System.out.println(p.getName());
        }
        //myBoard.showBoard();

        //RegularPiece myPiece = new RegularPiece();
        //myPiece.move(3,4);

    }
}
