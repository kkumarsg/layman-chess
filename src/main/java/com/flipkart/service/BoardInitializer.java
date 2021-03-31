package com.flipkart.service;

import com.flipkart.models.*;

public class BoardInitializer {

    public static void initializeBoard(Box[][] board) {

        initializeSoldiers(board);

        initializeElephants(board);

        initializeKnights(board);

        initializeBishop(board);

        initializeQueen(board);

        initializeKing(board);

    }

    private static void initializeQueen(Box[][] board) {
        initializeKingOrQueen(board, 3, PawnName.QUEEN, 4);
    }

    private static void initializeKing(Box[][] board) {
        initializeKingOrQueen(board, 4, PawnName.KING, 3);
    }

    private static void initializeBishop(Box[][] board) {
        initializePawnOfType(board, 2, PawnName.BISHOP, 5, 2, 0);
    }

    private static void initializeKnights(Box[][] board) {
        initializePawnOfType(board, 1, PawnName.KNIGHT, 6, 1, 7);
    }

    private static void initializeElephants(Box[][] board) {
        initializePawnOfType(board, 0, PawnName.ELEPHANT, 7, 0, 7);
    }


    private static void initializeSoldiers(Box[][] board) {
        for(int i=1; i<8; i=i+5){
            for(int j=0; j<8; j++){
                Postition postition = new Postition(i, j);
                Pawn pawn = new Pawn(PawnName.SOLDIER, PawnType.WHITE);
                if(i==6)
                    pawn.setType(PawnType.BLACK);
                board[i][j] = new Box(postition, pawn);
            }
        }
    }

    private static void initializePawnOfType(Box[][] board, int firstWhitePosition, PawnName pawnName, int secondWhitePosition, int firstBlackPosition, int secondBlackPosition) {
        board[0][firstWhitePosition] = new Box(new Postition(0, firstWhitePosition), new Pawn(pawnName, PawnType.WHITE));
        board[0][secondWhitePosition] = new Box(new Postition(0, secondWhitePosition), new Pawn(pawnName, PawnType.WHITE));
        board[7][firstBlackPosition] = new Box(new Postition(7, firstBlackPosition), new Pawn(pawnName, PawnType.BLACK));
        board[7][secondWhitePosition] = new Box(new Postition(secondBlackPosition, secondWhitePosition), new Pawn(pawnName, PawnType.BLACK));
    }

    private static void initializeKingOrQueen(Box[][] board, int whitePosition, PawnName pawnName, int blackPosition) {
        board[0][whitePosition] = new Box(new Postition(0, whitePosition), new Pawn(pawnName, PawnType.WHITE));
        board[7][blackPosition] = new Box(new Postition(7, blackPosition), new Pawn(pawnName, PawnType.BLACK));
    }

}
