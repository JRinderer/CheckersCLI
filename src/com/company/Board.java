package com.company;

public class Board {

    RegularPiece redPiece[] = new RegularPiece[12];
    RegularPiece whitePiece[] = new RegularPiece[12];
    RegularPiece emptyPiece[] = new RegularPiece[40];
    String xCord;
    String yCord;

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
        for (int i = 0; i < 12; i++) {
            redPiece[i] = new RegularPiece(1);
        }
        //create 12 white pieces
        for (int i = 0; i < 12; i++) {
            whitePiece[i] = new RegularPiece(2);
        }
        //create 40 empty spaces with an empty piece
        for (int i = 0; i < 40; i++) {
            emptyPiece[i] = new RegularPiece(0);
        }

        //with all the pieces created (empty Pieces for Empty spaces)
        //loop through rows row 0:2 will be red. rows 3:4 will be totally empty. Row 5:7 will be white
        for (int x = 0; x < 8; x++) {
            switch (x) {
                case 0:
                    setOddCols(x, redPiece);
                    break;
                case 1:
                    setEvenCols(x,redPiece);
                    break;
                case 2:
                    setOddCols(x,redPiece);
                    break;
                case 3: //empty rows
                    sentAllBlank(x);
                    break;
                case 4: //empty rows
                    sentAllBlank(x);
                    break;
                case 5: //white rows
                    setOddCols(x, whitePiece);
                    break;
                case 6: //white rows
                    setEvenCols(x,whitePiece);
                    break;
                case 7: //white rows
                    setOddCols(x, whitePiece);
                    break;
            }

        }

    }

    public void setOddCols(int row, Piece[] pieces) {
        int pieceCounter = 0;
        for(int y = 0;y<8;y++){
            if(y%2==0){
                setPieceOnSpace(pieces[y],row,y);
                pieces[y].setName("__R" +  pieceCounter + y + "_" );
            }
            else{
                setPieceOnSpace(emptyPiece[y],row,y);
                emptyPiece[y].setName("__" + row + "-" + y + "__");
            }

        }
    }

    public void sentAllBlank(int row){
        for (int y=0;y<8;y++){
            setPieceOnSpace(emptyPiece[y],row,y);
        }
    }


    public void setEvenCols(int row,Piece[] pieces) {
        int pieceCounter = 0;
        for(int y = 0;y<8;y++){
            if(y%2!=0){
                setPieceOnSpace(pieces[y],row,y);
                pieces[y].setName("__R" + y +  pieceCounter + "_" );
            }
            else{
                setPieceOnSpace(emptyPiece[y],row,y);
                emptyPiece[y].setName("__" + row + "-" + y + "__");
            }

        }
    }

    public void showBoard() {
        pieceCounter = 0;
        emptyCounter = 0;

        //print first row
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                System.out.print(squares[x][y].getPieceName());

            }
        }
    }

    public void setPieceOnSpace(Piece piece, int x, int y ) {

        squares[x][y].setPiece(piece);
    }

    public void clearSpace(Square sqr) {
        //squares
    }

}