package com.flipkart.models;

public class Postition {

    private int x;
    private int y;

    public Postition(int x, int y) {
        if(x>7 || x<0 || y<0 || y>7){
            System.err.println("Invalid position for the chessboard");
            return ;
        }
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
