package com.flipkart.service;

import com.flipkart.models.*;

import java.util.List;

public class ChessGameHelper {

    private GameTracker gameTracker;

    public void createNewGame(){
         gameTracker = new GameTracker();
         Box[][] board = new Box[8][8];
         BoardInitializer.initializeBoard(board);
    }



    public List<Box> findPossiblePaths(Box start){
        return null;
    }

    public void makeAMove(Box start, Box end){



    }


}
