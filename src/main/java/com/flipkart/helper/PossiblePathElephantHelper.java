package com.flipkart.helper;

import com.flipkart.models.Box;
import com.flipkart.models.Postition;

import java.util.ArrayList;
import java.util.List;

import static com.flipkart.service.PossiblePathHelper.addOppositeCoinPositionIfPresent;
import static com.flipkart.service.PossiblePathHelper.validPosition;

public class PossiblePathElephantHelper {

    public static List<Postition> possiblePathForElephant(Box[][] board, int x, int y) {

        List<Postition> possiblePositions = new ArrayList<>();

        topPossiblePositions(board, x, y, possiblePositions, x-1);
        leftPossiblePositions(board, x, y, possiblePositions, y-1);
        rightPossiblePositions(board, x, y, possiblePositions, x, y+1);
        downPossiblePositions(board, x, y, possiblePositions, x+1);

        return possiblePositions;
    }

    private static void downPossiblePositions(Box[][] board, int x, int y, List<Postition> possiblePositions, int x3) {
        while(validPosition(x3, y)){
            if(board[x3][y]!=null){
                addOppositeCoinPositionIfPresent(board, x, y, possiblePositions, x3, y);
                break;
            }
            else {
                possiblePositions.add(new Postition(x3, y));
                x3 = x3 + 1;
            }
        }
    }

    private static void rightPossiblePositions(Box[][] board, int x, int y, List<Postition> possiblePositions, int x2, int y2) {
        while(validPosition(x2, y2)){
            if(board[x2][y2]!=null){
                addOppositeCoinPositionIfPresent(board, x, y, possiblePositions, x2, y2);
                break;
            }
            else {
                possiblePositions.add(new Postition(x2, y2));
                y2 = y2 + 1;
            }
        }
    }

    private static void topPossiblePositions(Box[][] board, int x, int y, List<Postition> possiblePositions, int x1) {
        while(validPosition(x1, y)){
            if(board[x1][y]!=null){
                addOppositeCoinPositionIfPresent(board, x, y, possiblePositions, x1, y);
                break;
            }
            else {
                possiblePositions.add(new Postition(x1, y));
                x1 = x1 - 1;
            }
        }
    }

    private static void leftPossiblePositions(Box[][] board, int x, int y, List<Postition> possiblePositions, int y1) {
        while(validPosition(x, y1)){
            if(board[x][y1]!=null){
                addOppositeCoinPositionIfPresent(board, x, y, possiblePositions, x, y1);
                break;
            }
            else {
                possiblePositions.add(new Postition(x, y1));
                y1 = y1 - 1;
            }
        }
    }
}
