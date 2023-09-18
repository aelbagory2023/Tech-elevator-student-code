package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter measurement: ");
		String userInput = scanner.nextLine();
		int startingMeasurement = Integer.parseInt(userInput);

		System.out.println("Is the measurement in meters or Feet?");
		String measurementType = scanner.nextLine();
		if(measurementType.equals("m") || measurementType.equals("M")){
			double measurementInFeet = startingMeasurement * 3.2808399;
			System.out.println("Successfully converted " + startingMeasurement + " m to: " + measurementInFeet+ " f.");

		} else if(measurementType.equalsIgnoreCase("f")) {
			double measurementInMeters = (startingMeasurement * 0.3048);
			System.out.println("Successfully converted " + startingMeasurement + " F to: " + measurementInMeters + " m.");
		}
	}

}
