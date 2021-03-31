package com.flipkart.models;

public class Box {

    private Pawn pawn;
    private Postition postition;

    public Box(Postition postition, Pawn pawn) {
        this.pawn = pawn;
        this.postition = postition;
    }
}
