package com.techelevator;

public class TriangleWall extends Wall {
    private int base;
    private int height;
    public TriangleWall(String name, String color, int base, int height) {
        super(name, color);
        this.height = height;
        this.base = base;
    }
        @Override
        public int getArea() {
        return (base * height)/ 2;

        }
    public String toString() {
        return super.getName() + " (" + base + "x" + height + ") triangle";
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }





    }
