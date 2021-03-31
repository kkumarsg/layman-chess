package com.flipkart.models;

public class Pawn {

    private PawnType type;
    private PawnName pawnName;

    public Pawn(PawnName pawnName, PawnType pawnType) {
        this.pawnName = pawnName;
        this.type = pawnType;
    }

    public PawnType getType() {
        return type;
    }

    public void setType(PawnType type) {
        this.type = type;
    }

    public PawnName getPawnName() {
        return pawnName;
    }

    public void setPawnName(PawnName pawnName) {
        this.pawnName = pawnName;
    }
}
