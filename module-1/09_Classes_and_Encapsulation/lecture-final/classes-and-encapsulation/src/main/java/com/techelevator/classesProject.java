package com.techelevator;

public class classesProject {

	public static void main(String[] args) {

			Car myCar = new Car();
			String s = myCar.getMake();
			System.out.println("The make of my new car is: " + s);
			myCar.setMake("Porsche");
			System.out.println("The make of my new car now is: " + myCar.getMake());
			myCar.setModel("Macan");
			myCar.setColor("Black");
			myCar.setNumberOfDoors(4);
			System.out.println("My new car is a " +
				myCar.getMake() + " " + myCar.getModel() +
					" and it is " + myCar.getColor() + ", and it has " +
					myCar.getNumberOfDoors() + " doors."
			);

			Car anotherCar = new Car("Audi", "S4", "Gold", 4);
			System.out.println("My new car is a " +
				anotherCar.getMake() + " " + anotherCar.getModel() +
				" and it is " + anotherCar.getColor() + ", and it has " +
				anotherCar.getNumberOfDoors() + " doors."
			);

			//I can't actually do the line below, because there is no constructor that only takes 2 values
			//Car thirdCar = new Car("Lamborghini", "Gallardo");

			Car thirdCar = new Car("Lamborghini", "Gallardo", null, 0);
			System.out.println(thirdCar.getColor());

			//call a method on one of the cars
			String d = myCar.drive("Tori"); //put the return of the method into a variable
			System.out.println(d);

			//use the return of the method directly
			System.out.println(anotherCar.drive("Nate") + "and the car is the " + anotherCar.getMake() );
	}

}