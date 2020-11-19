package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    //Fixing git
    public static void main(String[] args){
        ArrayList<Piece> currentPieces = new ArrayList<>();
        Board myBoard = new Board();
        System.out.println("=========================================================");
        System.out.println("========================The Board========================");

        currentPieces = myBoard.showBoard();

        System.out.println("=========================================================");
        System.out.println("========================The Pieces=======================");



        for(Piece p : currentPieces){
            //System.out.println(p.getName());
        }

        Piece x = new RegularPiece();
        Piece y = new RegularPiece();
        Piece z = new RegularPiece();
        Piece a = new RegularPiece();
        Piece b = new RegularPiece();
        Piece w72 = new RegularPiece();

        a = currentPieces.get(19); //R2-3

        x = currentPieces.get(17); //R2-1
        y = currentPieces.get(40); //W5-0
        z = currentPieces.get(42); //W5-2
        b = currentPieces.get(51); // W6-3
        w72 = currentPieces.get(58);
        System.out.println(w72.getName());


        boolean canMoveHere;
        canMoveHere = x.move(myBoard, 3,0);

        canMoveHere = a.move(myBoard,3,2);

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

        //if this piece is not moved we can't jump
        canMoveHere = z.move(myBoard,4,3);

        //this bottom is illegal move
        //canMoveHere = z.move(myBoard,5,2);

        canMoveHere = y.move(myBoard,4,1);

        System.out.println("=========================================================");
        System.out.println("========================The Board========================");
        myBoard.showBoard();

        canMoveHere = x.move(myBoard,5,2);

        //jump E5-0;
        //canMoveHere = x.move(myBoard,4,1);
        System.out.println("=========================================================");
        System.out.println("========================The Board========================");
        currentPieces = myBoard.showBoard();

        System.out.println("=========================================================");
        System.out.println("========================The Board========================");
        canMoveHere = y.move(myBoard,2,3);
        currentPieces =  myBoard.showBoard();
        //RegularPiece myPiece = new RegularPiece();
        //myPiece.move(3,4);
        canMoveHere = b.move(myBoard,4,1);
        b.getName();

        System.out.println("=========================================================");
        System.out.println("========================The Board========================");
        myBoard.showBoard();

        System.out.println("=========================================================");
        System.out.println("========================The Board========================");
        canMoveHere = a.move(myBoard,5,0);
        currentPieces = myBoard.showBoard();

        System.out.println("=========================================================");
        System.out.println("========================The Board========================");
        canMoveHere = w72.move(myBoard,6,3);
        currentPieces = myBoard.showBoard();

        //R2-3 is kinged
        System.out.println("=========================================================");
        System.out.println("========================The Board========================");
        canMoveHere = a.move(myBoard,7,2);
        currentPieces = myBoard.showBoard();
        //piece was created on square 58, so it's still square 58. Technically a brand new piece.
        w72 = currentPieces.get(58);
        System.out.println(w72.getName());

        System.out.println("=========================================================");
        System.out.println("========================The Board========================");
        canMoveHere = w72.move(myBoard,6,1);
        currentPieces = myBoard.showBoard();

        System.out.println("=========================================================");
        System.out.println("========================The Board========================");
        canMoveHere = z.move(myBoard,5,2);
        currentPieces = myBoard.showBoard();

        System.out.println("=========================================================");
        System.out.println("========================The Board========================");
        canMoveHere = w72.move(myBoard,5,0);
        currentPieces = myBoard.showBoard();

    }
}
