package com.techelevator.farm;

import java.math.BigDecimal;

public class OldMacdonald {
	public static void main(String[] args) {

		//FarmAnimal[] farmAnimals = new FarmAnimal[] { new Cow(), new Chicken(), new Pig() };
		Singable[] singables = new Singable[] { new Cow(), new Chicken(), new Tractor(), new Pig(), new Truck()};

		for (Singable thing : singables) {
			String name = thing.getName();
			String sound = thing.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}

		//we need some stuff for sale
		Sellable[] forSale = new Sellable[] { new Egg(), new Egg(), new Egg(), new Hay(), new Hay(), new Chicken(), new Cow(), new Pig(), new Cow(), new Cow() };

		BigDecimal profit = new BigDecimal("0.00");
		for(Sellable item : forSale) {
			profit = profit.add(item.getPrice()); //right it's BigDecimal math yay woo
		}
		System.out.println("Okay, the farm has made " + profit + "!");

		Tractor iH = new Tractor();
		Truck dodge = new Truck();

		System.out.println(iH.drive(true)); //drive the tractor, with gas in it
		System.out.println(iH.drive(false)); //drive the tractor, with no fuel

		System.out.println(dodge.drive(true)); //drive the truck, with gas in it
		System.out.println(dodge.drive(false)); //drive the truck, with no fuel


//		FarmVehicle[] farmVehicles = new FarmVehicle[] { new Tractor(), new Truck() };
//
//		for (FarmVehicle vehicle : farmVehicles) {
//			String name = vehicle.getName();
//			String sound = vehicle.getSound();
//			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
//			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
//			System.out.println("With a " + sound + " " + sound + " here");
//			System.out.println("And a " + sound + " " + sound + " there");
//			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
//			System.out.println();
//		}
	}
}