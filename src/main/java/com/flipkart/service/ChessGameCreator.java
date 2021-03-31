package com.flipkart.service;

import com.flipkart.exception.ChessGameException;
import com.flipkart.models.*;

import java.util.List;

public class ChessGameCreator {


    public static void main(String[] args) throws ChessGameException {
        new ChessGameCreator().createNewGame();
    }

    private GameTracker gameTracker;

    public Box[][] createNewGame() throws ChessGameException {
         gameTracker = new GameTracker();
         Box[][] board = new Box[8][8];
         BoardInitializer.initializeBoard(board);

         BoardPrinter.printBoard(board);
         new ChessGameCreator().makeAMove(board[0][1], new Postition(2,2), board);
         BoardPrinter.printBoard(board);
         return board;
    }



    public List<Box> findPossiblePaths(Box start, Box[][] board){
        return null;
    }

    public void makeAMove(Box start, Postition end, Box[][] board) throws ChessGameException {

        if(end == null || checkIfPositionIsInsideTheBoard(end)){
            throw new ChessGameException("Sorry, you cannot move out of the board ");
        }
        // checking if start is in the board.
        if(start==null || checkIfPositionIsInsideTheBoard(start.getPostition())){
            throw new ChessGameException("Sorry, you cannot enter the board now :D");
        }
        board[end.getX()][end.getY()] = start;
        board[start.getPostition().getX()][start.getPostition().getY()] = null;

    }

    private boolean checkIfPositionIsInsideTheBoard(Postition postition) {
        return postition!=null && postition.getX() < 0 || postition.getX() > 7 || postition.getY() < 0 || postition.getY() > 7;
    }


}
