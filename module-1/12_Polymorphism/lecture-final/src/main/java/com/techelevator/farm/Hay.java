package com.techelevator.farm;

import java.math.BigDecimal;

public class Hay implements Sellable{

    private String name;
    private BigDecimal price;

    public Hay() {
        this.name = "Hay";
        this.price = new BigDecimal("9.00");
    }

    public String getName() {return this.name;}
    public BigDecimal getPrice() { return this.price;}

}
