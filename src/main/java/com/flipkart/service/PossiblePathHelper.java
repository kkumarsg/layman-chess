package com.flipkart.service;

import com.flipkart.exception.ChessGameException;
import com.flipkart.models.Box;
import com.flipkart.models.PawnType;
import com.flipkart.models.Postition;

import java.util.ArrayList;
import java.util.List;

public class PossiblePathHelper {

    public static boolean isValidMovePossible(Box[][] board, int x1, int y1, int x, int y) {
        return validPosition(x1, y1)
                && board[x1][y1] != null
                && board[x1][y1].getPawn() != null
                && !board[x][y].getPawn().getType().equals(board[x1][y1].getPawn().getType());
    }

    public static void addOppositeCoinPositionIfPresent(Box[][] board, int x, int y, List<Postition> possiblePositions, int x2, int y2) {
        if (board[x2][y2].getPawn() != null && board[x2][y2].getPawn().getType() != null) {
            if (!board[x2][y2].getPawn().getType().equals(board[x][y].getPawn().getType())) {
                possiblePositions.add(new Postition(x2, y2));
            }
        }
    }

    public static boolean validPosition(int x, int y) {
        return x < 0 || x > 7 || y < 0 || y > 7;
    }
}
