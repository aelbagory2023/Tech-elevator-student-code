package com.techelevator;

public class Elevator {
    private int currentFloor ;
    private int numberOfFloors;
    private boolean doorOpen;

    public Elevator(int numberOfLevels) {
        this.numberOfFloors = numberOfLevels;
        currentFloor = 1;
    }
    public int getCurrentFloor() {
        return currentFloor;
    }
    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    public boolean isDoorOpen() {

           return doorOpen;
       }
    public void openDoor() {
        doorOpen = true;
    }
    public void closeDoor() {
        doorOpen = false;
    }
    public void goUp(int desiredFloor) {
       openDoor();
       closeDoor();
       if(desiredFloor <= numberOfFloors) {
           currentFloor = desiredFloor;
       }
    }
    public void goDown(int desiredFloor) {
        openDoor();
        closeDoor();
        if(desiredFloor <= numberOfFloors && desiredFloor >= 1) {
            currentFloor = desiredFloor;
        }
    }
    }


