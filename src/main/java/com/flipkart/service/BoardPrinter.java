package com.flipkart.service;

import com.flipkart.models.Box;
import com.flipkart.models.PawnName;
import com.flipkart.models.PawnType;

import java.util.HashMap;
import java.util.Map;

public class BoardPrinter {

    private static Map<PawnName, String> pawnNameToShortNameMap;

    static {
        pawnNameToShortNameMap = new HashMap<>();
        pawnNameToShortNameMap.put(PawnName.SOLDIER, "S");
        pawnNameToShortNameMap.put(PawnName.KING, "K");
        pawnNameToShortNameMap.put(PawnName.QUEEN, "Q");
        pawnNameToShortNameMap.put(PawnName.ELEPHANT, "E");
        pawnNameToShortNameMap.put(PawnName.KNIGHT, "H");
        pawnNameToShortNameMap.put(PawnName.BISHOP, "B");
    }

    public static void printBoard(Box[][] board){

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                StringBuilder builder = new StringBuilder();
                StringBuilder pawnName = new StringBuilder();
                builder.append("|");
                Box box = board[i][j];
                if(box!=null && box.getPawn()!=null){
                    builder.append(pawnNameToShortNameMap.get(box.getPawn().getPawnName()));
                    if(PawnType.WHITE.equals(box.getPawn().getType())){
                        pawnName.append("W");
                    }
                    else if(PawnType.BLACK.equals(box.getPawn().getType())){
                        pawnName.append("B");
                    }

                }
                if(pawnName.length()==0)
                    builder.append("  |");
                else
                    builder.append(pawnName).append("|");
                System.out.print(builder);
            }
            System.out.println();
        }
    }


}
