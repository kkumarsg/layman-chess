package com.flipkart.helper;

import com.flipkart.models.Box;
import com.flipkart.models.Postition;

import java.util.ArrayList;
import java.util.List;

import static com.flipkart.service.PossiblePathHelper.addOppositeCoinPositionIfPresent;
import static com.flipkart.service.PossiblePathHelper.validPosition;

public class PossiblePathBishopHelper {

    public static List<Postition> possiblePathForBishop(Box[][] board, int x, int y) {
        List<Postition> possiblePositions = new ArrayList<>();

        leftTopPositions(board, x, y, possiblePositions, x-1, y-1);
        leftBottomPositions(board, x, y, possiblePositions, x+1, y-1);
        rightTopPositions(board, x, y, possiblePositions, x-1, y+1);
        rightBottomPositions(board, x, y, possiblePositions, x+1, y+1);

        return possiblePositions;

    }

    private static void rightBottomPositions(Box[][] board, int x, int y, List<Postition> possiblePositions, int x4, int y4) {
        while(validPosition(x4, y4)){
            if(board[x4][y4]!=null){
                addOppositeCoinPositionIfPresent(board, x, y, possiblePositions, x4, y4);
                break;
            }
            else {
                possiblePositions.add(new Postition(x4, y4));
                x4 = x4 + 1;
                y4 = y4 + 1;
            }
        }
    }

    private static void rightTopPositions(Box[][] board, int x, int y, List<Postition> possiblePositions, int x3, int y3) {
        while(validPosition(x3, y3)){
            if(board[x3][y3]!=null){
                addOppositeCoinPositionIfPresent(board, x, y, possiblePositions, x3, y3);
                break;
            }
            else {
                possiblePositions.add(new Postition(x3, y3));
                x3 = x3 - 1;
                y3 = y3 + 1;
            }
        }
    }

    private static void leftBottomPositions(Box[][] board, int x, int y, List<Postition> possiblePositions, int x2, int y2) {
        while(validPosition(x2, y2)){
            if(board[x2][y2]!=null){
                addOppositeCoinPositionIfPresent(board, x, y, possiblePositions, x2, y2);
                break;
            }
            else {
                possiblePositions.add(new Postition(x2, y2));
                x2 = x2 + 1;
                y2 = y2 - 1;
            }
        }
    }

    private static void leftTopPositions(Box[][] board, int x, int y, List<Postition> possiblePositions, int x1, int y1) {
        while(validPosition(x1, y1)){
            if(board[x1][y1]!=null){
                addOppositeCoinPositionIfPresent(board, x, y, possiblePositions, x1, y1);
                break;
            }
            else {
                possiblePositions.add(new Postition(x1, y1));
                x1 = x1 - 1;
                y1 = y1 - 1;
            }
        }
    }
}
