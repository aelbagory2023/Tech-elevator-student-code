package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Temperature: ");
		String userInput = scanner.nextLine();
		int startingTemperature = Integer.parseInt(userInput);

		System.out.println("Is the temperature in Celsius or Fahrenheit?");
		String degreeType = scanner.nextLine();
		if(degreeType.equals("C")){
			double temperatureFarenheit = startingTemperature * 1.8 + 32;
			System.out.println("Successfully converted " + startingTemperature + " C to: " + temperatureFarenheit + " F.");

		} else {
			double temperatureCelsius = (startingTemperature - 32) / 1.8;
			System.out.println("Successfully converted " + startingTemperature + " F to: " + temperatureCelsius + " C.");
		}








	}

}
