package com.techelevator;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
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

		File myCoolDir = new File(path); //identify a file or path that exists

		if(myCoolDir.exists()) {
			System.out.println("Name: " + myCoolDir.getName());
			System.out.println("Path: " + myCoolDir.getAbsolutePath());
			System.out.println("Size: " + myCoolDir.length());
			if(myCoolDir.isFile()) {
				System.out.println("This is a file!");
			}
			else if (myCoolDir.isDirectory()) {
				System.out.println("This is a directory!");
			}
		}

		//LET'S WRITE TO A FILE

		//we actually do have to make a file to write to
		System.out.println("Let's put a file in the directory that you put in!");
		System.out.println("What do you want the name of your file to be?");
		String filename = userInput.nextLine();

		File newFile = new File(myCoolDir, filename); //actually make a file by passing in the path (location), and the file name
		System.out.println("Name: " + newFile.getName());
		System.out.println("Path: " + newFile.getAbsolutePath());
		System.out.println("Size: " + newFile.length());
		//all I have at this point in time is an object in memory, not a new file on my file system

		boolean created = newFile.createNewFile(); //actually creates the file on the file system
		//you don't HAVE to do anything with the boolean, you could just say newFile.createNewFile() and call it a day and then use the file
		if(created) {
			System.out.println("The file was created!");
		}
		else {
			System.out.println("The file already exists!  Go ahead and use it.");
		}



		//okay now for the writing part
		System.out.println("What do you want to write in your file?");
		String message = userInput.nextLine();

		//open a PrintWriter to the new file - standard version that will overwrite any existing file contents
//		try (PrintWriter writer = new PrintWriter(newFile)) {
//			writer.println(message);
//		}

		//if you want to append text to what is already in the file, you need a new FileOutputStream object with the "true" parameter
		try (PrintWriter pw = new PrintWriter(new FileOutputStream(newFile, true) )) {
			pw.println(message);
		}
		catch(FileNotFoundException ex) {
			System.err.println("I'M AN ERROR"); //System.err.println prints it out in NICE RED LETTERS TO SHOW YOU THAT SOMETHING IS WRONG
		}


		System.out.println("Size: " + newFile.length());





	}

}
