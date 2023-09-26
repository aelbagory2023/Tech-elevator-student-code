package com.techelevator.farm;

import java.math.BigDecimal;

public class Chicken extends FarmAnimal implements Singable {


	public Chicken() {
		super("Chicken", "cluck!", new BigDecimal("15.00"));
	}

	public void layEgg() {
		System.out.println("Chicken laid an egg!");
	}

}