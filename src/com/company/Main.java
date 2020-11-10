package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    //Fixing git
    public static void main(String[] args){
        Board myBoard = new Board();
        System.out.println("=========================================================");
        System.out.println("========================The Board========================");
        myBoard.showBoard();

        System.out.println("=========================================================");
        System.out.println("========================The Pieces=======================");

        ArrayList<Piece> currentPieces = new ArrayList<>();
        currentPieces = myBoard.getPieces();
        for(Piece p : currentPieces){
            System.out.println(p.getName());
        }

        Piece x = new RegularPiece();
        x = currentPieces.get(16);
        System.out.println(x.getName());

        myBoard.setPieceOnSpace(x,3,1);

        myBoard.removePieceOnSpace(2,0);

        myBoard.showBoard();

        //RegularPiece myPiece = new RegularPiece();
        //myPiece.move(3,4);

    }
}
