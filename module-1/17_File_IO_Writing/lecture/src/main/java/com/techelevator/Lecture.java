package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) throws IOException {

		Scanner userInput = new Scanner(System.in);

		/*
		 * The java.io.File class is a representation of file and directory path names.  It provides methods to inspect and
		 * modify file system objects.
		 *
		 * One benefit is that it compensates for differences in Windows and Unix use of '/' and '\' as directory delimiters.
		 *
		 * A new instance of File can be created from a String that contains a file system path
		 */

		System.out.println("Enter the path for a directory: ");
		String path = userInput.nextLine();
		System.out.println("The path you put in is: " + path);

		File myCoolDirectory = new File(path); //identify a file or path that exists

		if(myCoolDirectory.exists()) {
			System.out.println("Name: " + myCoolDirectory.getName());
			System.out.println("Path: " + myCoolDirectory.getAbsolutePath());
			System.out.println("Size: "+ myCoolDirectory.length());
			if(myCoolDirectory.isFile()) {
				System.out.println("This is a file!");
			} else if (myCoolDirectory.isDirectory()) {
				System.out.println("This is a Directory!");
			}
		}
		//lets write to a file

		//we first make a file to write to
		System.out.println("Lets put a file in the directory that you put in!");
		System.out.println("What do you want the name of your file to be?");
		String filename = userInput.nextLine();

		File newFile = new File(myCoolDirectory, filename);  //actaully make a file by passing in the path (location), and the file name
		System.out.println("Name: " + newFile.getName());
		System.out.println("Path: " + newFile.getAbsolutePath());
		System.out.println("Size: " + newFile.length());
		//all I have at this point is an object in memory, not a new file on my file system.
		 newFile.createNewFile();

		 // now for the writing part
		System.out.println("what do you want to write in your file?");
		String message = userInput.nextLine();
		//open a new printWriter  to the new file

		try (PrintWriter pw = new PrintWriter(newFile)) {
			pw.println(message);
		}



	}

}
