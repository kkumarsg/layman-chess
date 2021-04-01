package com.flipkart.service;

import com.flipkart.exception.ChessGameException;
import com.flipkart.helper.*;
import com.flipkart.models.*;

import java.util.ArrayList;
import java.util.List;

public class ChessGameCreator {

    private Game game;

    public static void main(String[] args) {
        Game newGame = new ChessGameCreator().createNewGame();
        BoardPrinter.printBoard(newGame.getBoard());
    }

    public Game createNewGame(){
        game = new Game();
        Box[][] board = new Box[8][8];
        BoardInitializer.initializeBoard(board);
        game.setBoard(board);
        game.setTurn(PawnType.WHITE);
        return game;
    }


    public List<Postition> findPossiblePaths(Box start, Box[][] board) throws ChessGameException {

        List<Postition> possiblePositions = new ArrayList<>();

        if (start == null || start.getPostition() == null || start.getPawn() == null) {
            return possiblePositions;
        }

        int startX = start.getPostition().getX();
        int startY = start.getPostition().getY();

        if (PawnName.SOLDIER.equals(start.getPawn().getPawnName())) {
            if (PawnType.WHITE.equals(start.getPawn().getType())) {
                possiblePositions.addAll(PossiblePathWhiteSoldierHelper.possiblePathForWhiteSoldier(board, startX, startY));
            } else {
                possiblePositions.addAll(PossiblePathBlackSoldierHelper.possiblePathForBlackSoldier(board, startX, startY));
            }
        }

        if (PawnName.KNIGHT.equals(start.getPawn().getPawnName())) {
            possiblePositions.addAll(PossiblePathKnightHelper.possiblePathForKnight(board, startX, startY));
        }

        if (PawnName.BISHOP.equals(start.getPawn().getPawnName())) {
            possiblePositions.addAll(PossiblePathBishopHelper.possiblePathForBishop(board, startX, startY));
        }

        if (PawnName.ELEPHANT.equals(start.getPawn().getPawnName())) {
            possiblePositions.addAll(PossiblePathElephantHelper.possiblePathForElephant(board, startX, startY));
        }

        if (PawnName.QUEEN.equals(start.getPawn().getPawnName())) {
            possiblePositions.addAll(PossiblePathElephantHelper.possiblePathForElephant(board, startX, startY));
            possiblePositions.addAll(PossiblePathBishopHelper.possiblePathForBishop(board, startX, startY));
        }

        if (PawnName.KING.equals(start.getPawn().getPawnName())) {
            possiblePositions.addAll(PossiblePathKingHelper.possiblePathForKing(board, startX, startY));
        }

        return possiblePositions;
    }

    public void makeAMove(Postition start, Postition end, Box[][] board) throws ChessGameException {

        if (end == null || PossiblePathHelper.validPosition(end.getX(), end.getY())) {
            throw new ChessGameException("Sorry, you cannot move out of the board ");
        }
        // checking if start is in the board.
        if (start == null || PossiblePathHelper.validPosition(start.getX(), start.getY())) {
            throw new ChessGameException("Sorry, you cannot enter the board now :D");
        }
        board[end.getX()][end.getY()] = board[start.getX()][start.getY()];
        board[start.getX()][start.getY()] = null;

    }


}
