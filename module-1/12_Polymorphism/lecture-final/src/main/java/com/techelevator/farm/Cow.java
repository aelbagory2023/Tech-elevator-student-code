package com.techelevator.farm;

import java.math.BigDecimal;

public class Cow extends FarmAnimal implements Singable {

	public Cow() {
		super("Cow", "moo!", new BigDecimal("1000.00"));
	}

}