package com.flipkart.service;

import com.flipkart.models.*;

public class BoardInitializer {

    public static void initializeBoard(Box[][] board) {

        initializeSoldiers(board);


    }

    private static void initializeSoldiers(Box[][] board) {
        for(int i=1; i<8; i=i+6){
            for(int j=0; j<8; j++){
                Postition postition = new Postition(i, j);
                Pawn pawn = new Pawn(PawnName.SOLDIER, PawnType.WHITE);
                if(i==7)
                    pawn.setType(PawnType.BLACK);
                board[i][j] = new Box(postition, pawn);
            }
        }
    }
}
