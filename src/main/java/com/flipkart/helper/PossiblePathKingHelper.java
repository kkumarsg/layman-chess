package com.flipkart.helper;

import com.flipkart.models.Box;
import com.flipkart.models.Postition;

import java.util.ArrayList;
import java.util.List;

import static com.flipkart.service.PossiblePathHelper.isValidMovePossible;

public class PossiblePathKingHelper {

    public static List<Postition> possiblePathForKing(Box[][] board, int x, int y) {

        List<Postition> possiblePositions = new ArrayList<>();
        if (isValidMovePossible(board, x - 1, y - 1, x, y)) {
            possiblePositions.add(new Postition(x - 1, y - 1));
        }
        if (isValidMovePossible(board, x - 1, y , x, y)) {
            possiblePositions.add(new Postition(x - 1, y));
        }
        if (isValidMovePossible(board, x - 1, y + 1, x, y)) {
            possiblePositions.add(new Postition(x - 1, y + 1));
        }
        if (isValidMovePossible(board, x , y - 1, x, y)) {
            possiblePositions.add(new Postition(x , y - 1));
        }
        if (isValidMovePossible(board, x , y + 1, x, y)) {
            possiblePositions.add(new Postition(x , y + 1));
        }
        if (isValidMovePossible(board, x + 1, y - 1, x, y)) {
            possiblePositions.add(new Postition(x + 1, y - 1));
        }
        if (isValidMovePossible(board, x + 1, y , x, y)) {
            possiblePositions.add(new Postition(x + 1, y ));
        }
        if (isValidMovePossible(board, x + 1, y + 1, x, y)) {
            possiblePositions.add(new Postition(x + 1, y + 1));
        }
        return possiblePositions;
    }
}
