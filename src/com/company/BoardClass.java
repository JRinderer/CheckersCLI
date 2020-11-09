/*
package com.company;

public class BoardClass {
    //creat red pieces
        for(int x =0;x<3;x++){
        for(int y = 0; y<8;y++){
            switch (x%2){
                case 0:
                    if(x%2==0){
                        emptyPiece[y] = new RegularPiece(0);
                        emptyPiece[y].setName("__" + x + "-" + y + "__");
                    }else{
                        redPiece[y] = new RegularPiece(1);
                        redPiece[y].setName("Rr" + y);
                        squares[x][y] = new Square(redPiece[y],x,y,"RED");
                    }
                case 1:
                    if(x%2!=0){
                        redPiece[y] = new RegularPiece(1);
                        redPiece[y].setName("Rr" + y);
                        squares[x][y] = new Square(redPiece[y],x,y,"RED");
                    }else{
                        emptyPiece[y] = new RegularPiece(0);
                        emptyPiece[y].setName("__" + x + "-" + y + "__");
                    }
            }
        }
    }



    //redPiece = new RegularPiece(1);
    //whitePiece = new RegularPiece(2);

    //set empty pieces
*/
/*        for(int x = 0 ; x<7; x++){
            xCord = Integer.toString(x);
            for(int y = 0; y<8;y++){
                yCord = Integer.toString(y);
                emptyPiece[y] = new RegularPiece(0);
                emptyPiece[y].setName("__" + xCord + "-" + yCord + "__");
            }

        }*//*

    //print first row
     */
/*   for(int x = 0; x<8; x++){
            xCord = Integer.toString(x);
            for(int y = 0; y<8;y++){
                yCord = Integer.toString(y);
                if(y%2 == 0){
                    emptyPiece[y] = new RegularPiece(0);
                    emptyPiece[y].setName("__" + xCord + "-" + yCord + "__");
                    squares[x][y] =  new Square(emptyPiece[y],x,y,"");
                    //emptyCounter++;
                }else{
                    redPiece[y] = new RegularPiece(1);
                    redPiece[y].setName("Rr" + y);
                    squares[x][y] = new Square(redPiece[y],x,y,"RED");
                    pieceCounter++;
                }

            }

        }*//*


    //==============================================================================================

        */
/*squares[0][0] =  new Square("__0-0__|",0,0,"");
        squares[0][1] = new Square("__Rr___",0,1,"RED");
        squares[0][2] =  new Square("|__0-2__|",0,2,"");
        squares[0][3] = new Square("__Rr___",0,3,"RED");
        squares[0][4] =  new Square("|__0-4__|",0,4,"");
        squares[0][5] = new Square("__Rr___",0,5,"RED");
        squares[0][6] =  new Square("|__0-6__|",0,6,"");
        squares[0][7] = new Square("__Rr___|",0,7,"RED");

        squares[1][0] = new Square("__Rr___|",1,0,"RED");
        squares[1][1] =  new Square("__1-1__|",0,1,"");
        squares[1][2] = new Square("__Rr___|",1,2,"RED");
        squares[1][3] =  new Square("__1-3__|",0,3,"");
        squares[1][4] = new Square("__Rr___|",1,4,"RED");
        squares[1][5] =  new Square("__1-5__|",0,5,"");
        squares[1][6] = new Square("__Rr___|",1,6,"RED");
        squares[1][7] =  new Square("__1-7__|",0,7,"");

        squares[2][0] =  new Square("__2-0__|",0,0,"");
        squares[2][1] = new Square("__Rr___|",2,1,"RED");
        squares[2][2] =  new Square("__2-2__|",0,2,"");
        squares[2][3] = new Square("__Rr___|",2,3,"RED");
        squares[2][4] =  new Square("__2-4__|",0,4,"");
        squares[2][5] = new Square("__Rr___|",2,5,"RED");
        squares[2][6] =  new Square("__2-6__|",0,6,"");
        squares[2][7] = new Square("__Rr___|",2,7,"RED");

        //SET WHITE PIECES
        squares[5][0] =  new Square("__Wr___|",0,0,"WHITE");
        squares[5][1] = new Square("__5-1__|",0,1,"");
        squares[5][2] =  new Square("__Wr___|",0,2,"WHITE");
        squares[5][3] = new Square("__5-3__|",0,3,"");
        squares[5][4] =  new Square("__Wr___|",0,4,"WHITE");
        squares[5][5] = new Square("__5-5__|",0,5,"");
        squares[5][6] =  new Square("__Wr___|",0,6,"WHITE");
        squares[5][7] = new Square("__5-7__|",0,7,"");

        squares[6][0] = new Square("__6-0__|",1,0,"");
        squares[6][1] =  new Square("__Wr___|",0,1,"WHITE");
        squares[6][2] = new Square("__6-2__|",1,2,"");
        squares[6][3] =  new Square("__Wr___|",0,3,"WHITE");
        squares[6][4] = new Square("__6-4__|",1,4,"");
        squares[6][5] =  new Square("__Wr___|",0,5,"WHITE");
        squares[6][6] = new Square("__6-6__|",1,6,"");
        squares[6][7] =  new Square("__Wr___|",0,7,"WHITE");

        squares[7][0] =  new Square("__Wr___|",0,0,"WHITE");
        squares[7][1] = new Square("__7-1__|",2,1,"");
        squares[7][2] =  new Square("__Wr___|",0,2,"WHITE");
        squares[7][3] = new Square("__7-3__|",2,3,"");
        squares[7][4] =  new Square("__Wr___|",0,4,"WHITE");
        squares[7][5] = new Square("__7-5__|",2,5,"");
        squares[7][6] =  new Square("__Wr___|",0,6,"WHITE");
        squares[7][7] = new Square("__7-7__|",2,7,"");

        //set blank spaces
        squares[3][0] =  new Square("__3-0__|",0,0,"");
        squares[3][1] = new Square("__3-1__|",0,1,"");
        squares[3][2] =  new Square("__3-2__|",0,2,"");
        squares[3][3] = new Square("__3-3__|",0,3,"");
        squares[3][4] =  new Square("__3-4__|",0,4,"");
        squares[3][5] = new Square("__3-5__|",0,5,"");
        squares[3][6] =  new Square("__3-6__|",0,6,"");
        squares[3][7] = new Square("__3-7__|",0,7,"");

        squares[4][0] =  new Square("__4-0__|",0,0,"");
        squares[4][1] = new Square("__4-1__|",0,1,"");
        squares[4][2] =  new Square("__4-2__|",0,2,"");
        squares[4][3] = new Square("__4-3__|",0,3,"");
        squares[4][4] =  new Square("__4-4__|",0,4,"");
        squares[4][5] = new Square("__4-5__|",0,5,"");
        squares[4][6] =  new Square("__4-6__|",0,6,"");
        squares[4][7] = new Square("__4-7__|",0,7,"");*//*

}
*/
