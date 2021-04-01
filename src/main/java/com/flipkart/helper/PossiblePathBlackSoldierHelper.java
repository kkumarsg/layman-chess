package com.flipkart.helper;

import com.flipkart.exception.ChessGameException;
import com.flipkart.models.Box;
import com.flipkart.models.PawnType;
import com.flipkart.models.Postition;

import java.util.ArrayList;
import java.util.List;

public class PossiblePathBlackSoldierHelper {

    public static List<Postition> possiblePathForBlackSoldier(Box[][] board, int x, int y) throws ChessGameException {
        List<Postition> possiblePositions = new ArrayList<>();
        if (x == 7) {
            return possiblePositions;
        }
        if (x <= 0) {
            throw new ChessGameException("Illegal starting point for Black Soldier ");
        }
        if (board[x - 1][y] == null) {
            possiblePositions.add(new Postition(x - 1, y));
        }
        if (y > 0 && board[x - 1][y - 1] == null || board[x - 1][y - 1].getPawn() == null ||
                PawnType.WHITE.equals(board[x - 1][y - 1].getPawn().getType())) {
            possiblePositions.add(new Postition(x - 1, y - 1));
        }
        if (y < 7 && board[x - 1][y + 1] == null || board[x - 1][y + 1].getPawn() == null ||
                PawnType.WHITE.equals(board[x - 1][y + 1].getPawn().getType())) {
            possiblePositions.add(new Postition(x - 1, y + 1));
        }
        return possiblePositions;
    }
}
