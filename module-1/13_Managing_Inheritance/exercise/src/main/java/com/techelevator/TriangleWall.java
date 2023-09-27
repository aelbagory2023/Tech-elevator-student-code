package com.techelevator;

public class TriangleWall extends Wall {
    private int base;
    private int height;
    public TriangleWall(String name, String color, int height, int base) {
        super(name, color);
        this.height = height;
        this.base = base;
    }
        @Override
        public int getArea() {
        return (base * height)/ 2;

        }
    public String toString() {
        return super.getName() + " (" + height + "x" + base + ") triangle";
    }





    }
