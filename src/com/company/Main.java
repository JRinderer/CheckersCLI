package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static Piece findPiece(String name, Board board, Player player) {
        ArrayList<Piece> myLIst = new ArrayList<>();
        myLIst = board.getPieces();
        for (Piece piece : myLIst) {
            //validate that the piece name exists, and that the color is the same as the players
            if(Objects.isNull(piece.getFullName())){
                System.out.println(piece.getName());
            }
            if (piece.getFullName().equals(name) && player.getColor().equals(piece.getColor())) {
                return piece;
            }
        }
        System.out.println("The piece doesn't exist, or the players color doesn't match the piece selected. Try again");
        return null;
    }

    //Fixing git
    public static void main(String[] args) {
        ArrayList<Piece> currentPieces = new ArrayList<>();
        Scanner myScanner = new Scanner(System.in);
        Board myBoard = new Board();

        String cont = "y";
        String pieceName;
        int x;
        int y;

        Piece piece = new RegularPiece();
        boolean canMove;

        currentPieces = myBoard.showBoard();

        System.out.println("Continue?");
        cont = myScanner.nextLine();

        //setup players red goes first
        Player redPlayer = new Player(true,"R");
        Player whitePlayer = new Player(false,"W");
        //create an array list and store our players
        ArrayList<Player> players = new ArrayList<>();
        players.add(redPlayer);
        players.add(whitePlayer);

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
        Player playerHolder = new Player();

        while (cont.equals("y")) {
            //determine what players turn it is

            playerHolder = Player.whosTurn(players);

            System.out.println("Type a piece name:");
            pieceName = myScanner.nextLine();
            piece = findPiece(pieceName, myBoard, playerHolder);

            while(Objects.isNull(piece)){
                System.out.println("Type a piece name:");
                pieceName = myScanner.nextLine();
                piece = findPiece(pieceName, myBoard, playerHolder);
            }
            //added
            System.out.println("Enter the X coordinates to move the piece:");
            x = myScanner.nextInt();
            System.out.println("Enter the Y Coordinates to move the piece:");
            y = myScanner.nextInt();
            myScanner.nextLine();
            canMove = piece.move(myBoard, x, y, playerHolder);
            if(!canMove){
                System.out.println("Invalid move. Please try again!");
            }else{
                Player.flipTurn(players);
                playerHolder.setTurn(false);
            }

            currentPieces = myBoard.showBoard();
            System.out.println("Continue?");
            cont = myScanner.nextLine();
        }

    }
}
