package com.flipkart.models;

import java.util.Map;

public class Game {

    Box[][] board;
    PawnType turn;
    Map<PawnType, Postition> queenPositions;

    public Box[][] getBoard() {
        return board;
    }

    public void setBoard(Box[][] board) {
        this.board = board;
    }

    public PawnType getTurn() {
        return turn;
    }

    public void setTurn(PawnType turn) {
        this.turn = turn;
    }

    public Map<PawnType, Postition> getQueenPositions() {
        return queenPositions;
    }

    public void setQueenPositions(Map<PawnType, Postition> queenPositions) {
        this.queenPositions = queenPositions;
    }
}
