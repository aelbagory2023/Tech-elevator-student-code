package com.techelevator;

public class Car {

    //properties
    private String make;
    private String model;
    private String color;
    private int numberOfDoors;

    //getters and setters
    public String getMake() {
        return this.make;
    }

    public void setMake(String value) {
        this.make = value;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String value) {
        this.model = value;
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

    //constructors

    public Car() {} //need to define the default/empty constructor in order to make something with no values set

    //makes a car with a make, model, color, and number of doors set when it's made
    public Car(String make, String model, String color, int numOfDoors) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.numberOfDoors = numOfDoors;
    }

    //method
    public String drive(String driver) {
        return "Let's go, " + driver + " is driving the car!";
    }
}
