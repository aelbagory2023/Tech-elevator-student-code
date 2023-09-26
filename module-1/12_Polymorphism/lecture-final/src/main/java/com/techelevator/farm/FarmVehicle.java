package com.techelevator.farm;

public class FarmVehicle {
    private String name;
    private String sound;

    public FarmVehicle(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public String getName() { return this.name; }
    public String getSound() {return this.sound; }
}
