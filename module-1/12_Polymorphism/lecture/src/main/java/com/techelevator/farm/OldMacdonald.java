package com.techelevator.farm;

import java.math.BigDecimal;

public class OldMacdonald {
	public static void main(String[] args) {

//		FarmAnimal[] farmAnimals = new FarmAnimal[] { new Cow(), new Chicken(), new Pig()};

		Singable[] singables = new Singable[] {new Cow(),new Chicken(),new Tractor(),new Pig(), new Truck()};
		for (Singable animal : singables) {
			String name = animal.getName();
			String sound = animal.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}
//		Farmvehicle[] farmvehicles = new Farmvehicle[][] { new Truck(), new tractor(), new ()};
//
//		for (FarmAnimal animal : farmAnimals) {
//			String name = animal.getName();
//			String sound = animal.getSound();
//			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
//			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
//			System.out.println("With a " + sound + " " + sound + " here");
//			System.out.println("And a " + sound + " " + sound + " there");
//			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
//			System.out.println();
//		}
	}
}
	Sellable[] forSale = new Sellable[] {new Egg, new Egg, new Egg, new Hay, new Hay,new Chicken(),}

			BigDecimal profit = new BigDecimal(0.00)
					for(Sellable item: forSale) {
						profit.add(item.getPrice());
	}
}