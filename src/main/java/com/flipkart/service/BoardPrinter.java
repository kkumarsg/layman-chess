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

                Box box = board[i][j];
                if(box!=null && box.getPawn()!=null){
                    if(PawnType.WHITE.equals(box.getPawn().getType())){
                        builder.append("\u001B[34m");
                    }
                    else if(PawnType.BLACK.equals(box.getPawn().getType())){
                        builder.append("\u001B[31m");
                    }
                    builder.append("|").append(pawnNameToShortNameMap.get(box.getPawn().getPawnName())).append("");

                }
                else
                    builder.append("\u001B[30m| ");
                if(j==7){
                    builder.append("|");
                }
                System.out.print(builder);
            }
            System.out.println();
        }
    }


}
