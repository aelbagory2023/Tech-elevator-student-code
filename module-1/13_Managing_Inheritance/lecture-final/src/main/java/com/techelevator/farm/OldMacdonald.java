package com.techelevator.farm;

public class OldMacdonald {
	public static void main(String[] args) {

		Cow bessie = new Cow();
		bessie.sleep(true);

		Cat kitty = new Cat();
		kitty.sleep(true);

		//isAsleep is a private property, so the below line doesn't work
		//boolean x = kitty.isAsleep;

		System.out.println(kitty.eat());
		System.out.println(bessie.eat());

		Singable[] singables =
				new Singable[] {kitty, bessie, new Chicken(), new Pig(), new Tractor()};

		for (Singable singable : singables) {
			String name = singable.getName();
			String sound = singable.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name
					+ ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound
					+ " everywhere a " + sound + " " + sound);
			System.out.println();
		}

		Sellable[] sellables = new Sellable[] {new Cow(), new Pig(), new Egg()};

		for (Sellable sellable : sellables) {
			System.out.println("Step right up and get your " + sellable.getName());
			System.out.println("Only $" + sellable.getPrice());
		}
	}
}