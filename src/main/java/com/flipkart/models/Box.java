package com.flipkart.models;

public class Box {

    private Pawn pawn;
    private Postition postition;

    public Box(Postition postition, Pawn pawn) {
        this.pawn = pawn;
        this.postition = postition;
    }

    public Pawn getPawn() {
        return pawn;
    }

    public void setPawn(Pawn pawn) {
        this.pawn = pawn;
    }

    public Postition getPostition() {
        return postition;
    }

    public void setPostition(Postition postition) {
        this.postition = postition;
    }
}

