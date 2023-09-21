package com.techelevator;

public class Car {
    //properties
    private String make;
    private String model;
    private String color;
    private int numberOfDoors;

    //getters and setters
    public String getmake() {
        return this.make;
    }

    public void setMake(String value) {
        this.make = value;
    }
    public String getModel() {
        return this.model;

    }
    public void setModel(String value) {
        this.model= value;
    }
    public String getColor() {
        return this.color;

    }
    public void setColor(String value) {
        this.color = value;

    }
    public int getNumberOfDoors() {
        return this.numberOfDoors;

    }
    public void setNumberOfDoors(int value) {
        this.numberOfDoors = value;
    }
//constructor
    public Car() {}

    public Car(String make, String model,String color, int numberOfDoors) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
    }
    public String drive(String driver) {
        return "Let's go, " + driver + " is driving the car!";
    }
}


