package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Piece findPiece(String name, Board board) {
        ArrayList<Piece> myLIst = new ArrayList<>();
        myLIst = board.getPieces();
        for (Piece piece : myLIst) {
            if (piece.getName().contains(name)) {
                return piece;
            }
        }
        return null;
    }

    //Fixing git
    public static void main(String[] args) {
        ArrayList<Piece> currentPieces = new ArrayList<>();
        Scanner myScanner = new Scanner(System.in);
        Board myBoard = new Board();
        System.out.println("=========================================================");
        System.out.println("========================The Board========================");

        String cont = "y";
        String pieceName;
        int x;
        int y;

        Piece piece = new RegularPiece();
        boolean canMove;

        currentPieces = myBoard.showBoard();

        System.out.println("Continue?");
        cont = myScanner.nextLine();
        /*
        Piece r1 = currentPieces.get(1); //red piece
        Piece w1 = currentPieces.get(56);
        Piece w2 = currentPieces.get(49);

        myBoard.removePieceOnSpace(0,1);

        myBoard.removePieceOnSpace(7,2); //57
        w1.setStatus(0);
        w2.setStatus(0);
        myBoard.removePieceOnSpace(6,1); //50
        myBoard.setPieceOnSpace(r1,6,2);
        r1.setxCord(6);
        r1.setyCord(1);
        canMove = r1.move(myBoard,7,2);
        currentPieces = myBoard.showBoard();*/
        //

        while (cont.equals("y")) {
            System.out.println("Type a piece name:");
            pieceName = myScanner.nextLine();
            piece = findPiece(pieceName, myBoard);
            System.out.println("Enter the X coordinates to move the piece:");
            x = myScanner.nextInt();
            System.out.println("Enter the Y Coordinates to move the piece:");
            y = myScanner.nextInt();
            myScanner.nextLine();
            canMove = piece.move(myBoard, x, y);
            System.out.println("=========================================================");
            System.out.println("========================The Board========================");
            currentPieces = myBoard.showBoard();
            System.out.println("Continue?");
            cont = myScanner.nextLine();
        }

    }
}
