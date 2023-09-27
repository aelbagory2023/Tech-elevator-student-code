package com.techelevator.farm;

public abstract class FarmAnimal implements Singable {
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
	public final String getSound( ) {
		if(this.isAsleep == true) {
			//then it's asleep, snore
			return "Zzzz...";
		}
		//if it's not asleep, make noise
		return this.sound;
	}

	public void sleep(boolean isAsleep) {
		this.isAsleep = isAsleep;
	}

	public abstract String eat();
}