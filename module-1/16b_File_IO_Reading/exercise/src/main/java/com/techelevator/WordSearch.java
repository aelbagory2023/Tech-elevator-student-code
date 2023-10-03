package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class WordSearch {

	// Use this scanner for all user input. Don't create additional Scanners with System.in
	private final Scanner userInput = new Scanner(System.in);


	public static void main(String[] args) {
		WordSearch wordSearch = new WordSearch();
		wordSearch.run();

	}

	public void run() {
		/* Your code goes here */

		System.out.print("What is the fully qualified name of the file that should be searched?");
		String filePath = userInput.nextLine();
		File newFile = new File(filePath);
		System.out.print("What is the search word you are looking for?");
		String searchWord = userInput.nextLine().toLowerCase();

		try(Scanner fileScanner = new Scanner(newFile)) {



			int lineNumber = 0;
			while (fileScanner.hasNextLine()) {
				lineNumber++;
				String line = fileScanner.nextLine();
				if (line.contains(searchWord)) {
					System.out.println( lineNumber + ") " + line);


				}
			}

			userInput.close();

		} catch (FileNotFoundException e) {
				System.out.println("File not Found: " + filePath);

			}

	}

}
