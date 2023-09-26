package com.techelevator.farm;

public class Truck extends FarmVehicle implements Singable, Driveable{
public Truck() {
    super("Truck","vroom");


}
public String drive(boolean hasFuel) {
    if(hasFuel) {
        return "Truck yeah, we're driving the truck!";
    }
}
}
