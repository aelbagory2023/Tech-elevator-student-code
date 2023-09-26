package com.techelevator.farm;

public class Tractor extends FarmVehicle implements Singable, Driveable{
    public Tractor() {
        super("Tractor", "putt");
    }
     public String drive(boolean hasFuel) {
        if(hasFuel) {
            return " chug-a-alug-alug";
        }
     }
     return "craig mogran is out of gas";
}
