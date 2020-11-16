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
        Piece y = new RegularPiece();
        Piece z = new RegularPiece();
        Piece a = new RegularPiece();
        a = currentPieces.get(10);

        x = currentPieces.get(17);
        y = currentPieces.get(40);
        z = currentPieces.get(42);


        boolean canMoveHere;
        canMoveHere = x.move(myBoard, 3,0);

        //this is an illegal move test
        //canMoveHere = a.move(myBoard,2,1);

        //leave for comments sake
        //System.out.println(canMoveHere);
        //myBoard.setPieceOnSpace(x,3,0);
        //myBoard.removePieceOnSpace(2,1);


       /* canMoveHere = y.move(4,1);
        System.out.println(canMoveHere);
        myBoard.setPieceOnSpace(y,4,1);
        myBoard.removePieceOnSpace(5,0);

        canMoveHere = z.move(4,3);
        System.out.println(canMoveHere);
        myBoard.setPieceOnSpace(z,4,3);
        myBoard.removePieceOnSpace(5,2);*/

        //canMoveHere = x.move(myBoard,4,1);
        canMoveHere = x.move(myBoard,3,0);
        //canMoveHere = z.move(myBoard,4,3);
        //canMoveHere = z.move(myBoard,5,2);
        canMoveHere = y.move(myBoard,4,1);

        //jump E5-0;
        canMoveHere = x.move(myBoard,4,1);

        myBoard.showBoard();

        //RegularPiece myPiece = new RegularPiece();
        //myPiece.move(3,4);

    }
}
