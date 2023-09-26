package com.techelevator.farm;

import java.math.BigDecimal;

public class FarmAnimal implements Sellable{
	private String name;
	private String sound;
	private BigDecimal price;

	public FarmAnimal(String name, String sound, BigDecimal price) {
		this.name = name;
		this.sound = sound;
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public String getSound() {
		return this.sound;
	}

	@Override
	public BigDecimal getPrice() {
		return this.price;
	}
}