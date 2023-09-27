package com.techelevator.farm;

public class FarmAnimal implements Singable {
	private String name;
	private String sound;
	private boolean isAsleep;

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public String getName( ) {
		return name;
	}
	public String getSound( ) {
		if(this.isAsleep) {
			return "Zzzzz...";
		}
		return this.sound;
	}
	public void sleep(boolean isAsleep) {
		this.isAsleep = isAsleep;

	}
	

}