package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static Piece findPiece(String name, Board board, Player player) throws InterruptedException {
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
        TimeUnit.SECONDS.sleep(1);
        return null;
    }

    //Fixing git
    public static void main(String[] args) throws InterruptedException {
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

        //create a holder for the current player
        Player playerHolder = new Player();

        while (cont.equals("y")) {
            //determine what players turn it is

            playerHolder = Player.whosTurn(players);
            System.out.println(playerHolder.getColor() + " Player Turn");

            System.out.println("Type a piece name:");
            pieceName = myScanner.nextLine();
            piece = findPiece(pieceName, myBoard, playerHolder);

            while(Objects.isNull(piece)){
                System.out.println("Type a piece name:");
                pieceName = myScanner.nextLine();
                piece = findPiece(pieceName, myBoard, playerHolder);
            }
            //added
            try {
                System.out.println("Enter the X coordinates to move the piece:");
                x = myScanner.nextInt();
                System.out.println("Enter the Y Coordinates to move the piece:");
                y = myScanner.nextInt();
                myScanner.nextLine();
                canMove = piece.move(myBoard, x, y, playerHolder);
                if(!canMove){
                    System.out.println("Invalid move. Please try again!");
                    TimeUnit.SECONDS.sleep(1);
                }else{
                    Player.flipTurn(players);
                    playerHolder.setTurn(false);
                }
            }catch (Exception ex){
                System.out.println("Expected an integers for x ad y. Try again");
                TimeUnit.SECONDS.sleep(1);

            }

            currentPieces = myBoard.showBoard();
            System.out.println("Continue?");
            cont = myScanner.nextLine();
        }

    }
}
