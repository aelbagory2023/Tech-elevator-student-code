package com.techelevator.farm;

public class Tractor extends FarmVehicle implements Singable, Driveable{

    public Tractor() {
        super("Tractor", "putt");
    };

    public String drive(boolean hasFuel) {
        if(hasFuel) {
            return "Chug-a-lug-a-luggin' 5 miles per hour on my INTERNATIONAL HARVESTER!!!!!!!!!!";
        }
        return "Craig Morgan is super sad that the tractor is out of gas.";
    }

}
