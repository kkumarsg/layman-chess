package com.flipkart.helper;

import com.flipkart.models.Box;
import com.flipkart.models.Postition;

import java.util.ArrayList;
import java.util.List;

import static com.flipkart.service.PossiblePathHelper.isValidMovePossible;
import static com.flipkart.service.PossiblePathHelper.validPosition;

public class PossiblePathKnightHelper {

    public static List<Postition> possiblePathForKnight(Box[][] board, int x, int y) {
        List<Postition> possiblePositions = new ArrayList<>();
        if (!validPosition(x, y)) {
            return possiblePositions;
        }
        if (isValidMovePossible(board, x - 2, y + 1, x, y)) {
            possiblePositions.add(new Postition(x - 2, y + 1));
        }
        if (isValidMovePossible(board, x - 2, y - 1, x, y)) {
            possiblePositions.add(new Postition(x - 2, y - 1));
        }
        if (isValidMovePossible(board, x - 1, y + 2, x, y)) {
            possiblePositions.add(new Postition(x - 1, y + 2));
        }
        if (isValidMovePossible(board, x - 1, y - 2, x, y)) {
            possiblePositions.add(new Postition(x - 1, y - 2));
        }
        if (isValidMovePossible(board, x + 2, y + 1, x, y)) {
            possiblePositions.add(new Postition(x + 2, y + 1));
        }
        if (isValidMovePossible(board, x + 2, y - 1, x, y)) {
            possiblePositions.add(new Postition(x + 2, y - 1));
        }
        if (isValidMovePossible(board, x + 1, y + 2, x, y)) {
            possiblePositions.add(new Postition(x + 1, y + 2));
        }
        if (isValidMovePossible(board, x + 1, y - 2, x, y)) {
            possiblePositions.add(new Postition(x + 1, y - 2));
        }
        return possiblePositions;
    }
}
