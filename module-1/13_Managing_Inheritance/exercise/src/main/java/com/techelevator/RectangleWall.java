package com.techelevator;

public class RectangleWall extends Wall {
    private int length;
    private int height;

    public RectangleWall(String name, String color, int height, int length) {
        super(name, color);
        this.height = height;
        this.length = length;

    }
    @Override
    public int getArea() {
        return length * height;

    }
    public String toString() {
        return super.getName() + " (" + height + "x" + length + ") rectangle";
    }



}
