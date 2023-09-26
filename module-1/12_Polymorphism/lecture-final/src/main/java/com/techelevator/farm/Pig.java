package com.techelevator.farm;

import java.math.BigDecimal;

public class Pig extends FarmAnimal implements Singable{

    public Pig() {
        super("Pig", "oink", new BigDecimal("550.00"));
    }
}
