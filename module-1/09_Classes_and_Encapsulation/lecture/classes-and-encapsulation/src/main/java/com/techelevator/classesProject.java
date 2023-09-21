package com.techelevator;

public class classesProject {

	public static void main(String[] args) {

		Car myCar = new Car();
		String s = myCar.getmake();
		 System.out.println("The make of my new car is " + s);
		 myCar.setMake("Porsche");
		 System.out.println("The make of my new car now is: " + myCar.getmake());
		 myCar.setModel("Macan");
		myCar.setColor("black");
		myCar.setNumberOfDoors(4);
		System.out.println("My new car is a " + myCarModel() + " and it is " +  myCar.getmake() + " " + myCar.getColor() + " and it has " + myCar.getNumberOfDoors() + " doors" );

	}


