package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Board {
    //Fixing git
    String xCord;
    String yCord;
    ArrayList<RegularPiece> redPieces = new ArrayList<RegularPiece>();
    ArrayList<RegularPiece> whitePieces = new ArrayList<RegularPiece>();
    ArrayList<RegularPiece> emptyPieces = new ArrayList<RegularPiece>();


    int pieceCounter = 0;
    int emptyCounter = 0;

    Square[][] squares = new Square[8][8];

    public Board() {
        this.setBoard();
    }


    public void setBoard() {

        //we need to create squares in an 8x8 grade
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                squares[x][y] = new Square();
            }
        }

        //with empty squares created we can begin adding pieces row by row.
        //create 12 red pieces
        ArrayList<RegularPiece> tempList = new ArrayList<>();
        for (int x = 0; x < 8; x++) {
            switch (x) {
                case 0:
                    setOddCols(x, redPieces, "R");
                    break;
                case 1:
                    setEvenCols(x,redPieces,"R");
                    break;
                case 2:
                    setOddCols(x,redPieces,"R");
                    break;
                case 3: //empty rows
                    sentAllBlank(x);
                    break;
                case 4: //empty rows
                    sentAllBlank(x);
                    break;
                case 5: //white rows
                    setOddCols(x, whitePieces,"W");
                    break;
                case 6: //white rows
                    setEvenCols(x,whitePieces,"W");
                    break;
                case 7: //white rows
                    setOddCols(x, whitePieces,"W");
                    break;
            }
        }
    }

    public void setOddCols(int row, ArrayList<RegularPiece> pieces, String color) {
        int pieceCounter = 0;
        for(int y = 0;y<8;y++){
            if(y%2==0){
                RegularPiece thisPiece = new RegularPiece(1);
                setPieceOnSpace(thisPiece,row,y);
                thisPiece.setName("__"+ color +  row + "-" + y + "_" );
                pieces.add(thisPiece);
            }
            else{
                RegularPiece emptyPiece = new RegularPiece(0);
                setPieceOnSpace(emptyPiece,row,y);
                emptyPiece.setName("__" + row + "-" + y + "__");
            }

        }
    }

    public void sentAllBlank(int row){
        for (int y=0;y<8;y++){
            RegularPiece emptyPiece = new RegularPiece(0);
            setPieceOnSpace(emptyPiece,row,y);
            emptyPiece.setName("__" + row + "-" + y + "__");
        }
    }


    public void setEvenCols(int row,ArrayList<RegularPiece> pieces, String color) {
        int pieceCounter = 0;
        for(int y = 0;y<8;y++){
            if(y%2!=0){
                RegularPiece thisPiece = new RegularPiece(1);
                setPieceOnSpace(thisPiece,row,y);
                thisPiece.setName("__"+ color +  row + "-" + y + "_" );
                pieces.add(thisPiece);
            }
            else{
                RegularPiece emptyPiece = new RegularPiece(0);
                setPieceOnSpace(emptyPiece,row,y);
                emptyPiece.setName("__" + row + "-" + y + "__");
            }

        }
    }

    public void showBoard() {
        //print first row
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                System.out.print(squares[x][y].getPieceName());
            }
            System.out.println();
        }
    }

    public void setPieceOnSpace(Piece piece, int x, int y ) {

        squares[x][y].setPiece(piece);
    }

    public void clearSpace(Square sqr) {
        //squares
    }

    public ArrayList<Piece> getPieces() {
        ArrayList<Piece> tempList = new ArrayList<>();
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                tempList.add(squares[x][y].getPiece());
            }
        }
        return tempList;
    }

}
