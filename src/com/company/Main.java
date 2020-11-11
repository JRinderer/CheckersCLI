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
            //System.out.println(p.getName());
        }

        Piece x = new RegularPiece();
        x = currentPieces.get(17);
        System.out.println(x.getName());
        boolean canMoveHere;
        canMoveHere = x.move(3,0);
        System.out.println(canMoveHere);
        myBoard.setPieceOnSpace(x,3,0);

        myBoard.removePieceOnSpace(2,1);

        myBoard.showBoard();

        //RegularPiece myPiece = new RegularPiece();
        //myPiece.move(3,4);

    }
}
