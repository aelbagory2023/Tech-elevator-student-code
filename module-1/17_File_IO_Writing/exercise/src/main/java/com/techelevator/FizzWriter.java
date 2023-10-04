package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FizzWriter {

	// Use this scanner for all user input. Don't create additional Scanners with System.in
	private final Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		FizzWriter fizzWriter = new FizzWriter();
		fizzWriter.run();
	}

	public void run() {
		/* Your code goes here */
		System.out.println("What is the Destination File?");
		String destinationFile = userInput.nextLine();
		File newFile = new File(destinationFile);

		try (PrintWriter dataOutput = new PrintWriter(newFile)) {
			for (int i= 1; i <=300; i++) {
				String result = fizzBuzz(i);
				dataOutput.println(result);
				System.out.println("generated: " + i);
			}




		} catch (FileNotFoundException e) {
			System.err.println("error: File not found.");
		}


	}

	private static String fizzBuzz(int number) {
		if(number % 3 == 0 && number % 5 == 0) {
			return "FizzBuzz";
		} else if(number % 3 == 0) {
			return "Fizz";

		} else if(number % 5 == 0) {
			return "Buzz";
		} else {
			return Integer.toString(number);
		}
	}

}
