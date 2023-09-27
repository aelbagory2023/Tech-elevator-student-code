package com.techelevator;

public class RectangleWall extends Wall {
    private int length;
    private int height;

    public RectangleWall(String name, String color, int length, int height) {
        super(name, color);
        this.height = height;
        this.length = length;

    }
    @Override
    public int getArea() {
        return height * length;

    }
    public String toString() {
        return super.getName() + " (" + length + "x" + height + ") rectangle";
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }




}
   // RectangleWall rectangleWall = new RectangleWall("recWall","red", 10, 20 );