package com.techelevator;

import java.util.Locale;

public class Lecture {

	public static void main(String[] args) {

		String c = new String("cats"); //Strings are objects
		String[] carray = c.split("");
		for(int i = 0; i < carray.length; i++) {
		System.out.println(carray[i]);
		}
		carray[0] = carray[0].toUpperCase();
		for(int i = 0; i < carray.length; i++) {
			System.out.println(carray[i]);
		}
		c = String.join("", carray);
		System.out.println(c);

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */
		String raccoons = "Raccoons";
		System.out.println("My new string is: " + raccoons);
		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		System.out.println("--- CHARAT (Character At) ---");
		String name = "Celine Dion";
		char first = name.charAt(0); // get the first character, like arrays, we start at 0
		char fourth = name.charAt(3); //get the fourth character
		char last = name.charAt(name.length() -1); //get the last character
		System.out.println(name);
		System.out.println(first);
		System.out.println(fourth);
		System.out.println(last);

		System.out.println("--- startsWith / endsWith ---");
		boolean isLastNameDion = name.endsWith("Dion");
		System.out.println("Is Celine Dion's last name 'Dion'?" + isLastNameDion);


		System.out.println("------contains-------");
		String hello = "Hello There!";
		boolean containsHello = hello.contains("Hello");
		boolean containsHelloLowercase = hello.contains("hello");
		System.out.println("Does the string " + hello + " contain 'Hello'? " + containsHello);
		System.out.println("Does the string " + hello + " contain 'hello'? " + containsHelloLowercase);

		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf - finds the first instance of another string inside of a string
		 * lastIndexOf - finds the last instance of another string inside of a string
		 * length
		 * substring - extracts part of a string
		 * toLowerCase
		 * toUpperCase
		 * trim - trims whitespace from a string (trims spaces from start and end)
		 */

		System.out.println("-----------substring---------");
		String longerString = "I bought more acetone.";
		//substring has two parameters:
		//the first parameter is the starting index (where to start the substring in the original string) (inclusive)
		//the second is optional, you do not have to include it
		//the second the index where you want to end the substring in the original string (exclusive)
		//if you do not use the second parameter, the substring extends to the end of the original string
		int indexOfAcetone = longerString.indexOf("acetone");
		String acetone = longerString.substring(indexOfAcetone);
		System.out.println(acetone);
		String justAcetone = longerString.substring(indexOfAcetone, longerString.length() - 1);
		justAcetone = longerString.substring(indexOfAcetone, indexOfAcetone + 7);
		System.out.println(justAcetone);
		longerString = longerString.replace("acetone", "fire extinguishers");
		System.out.println(longerString);


		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

        char[] helloArray = new char[] { 'H', 'e', 'l', 'l', 'o' };
        String hello1 = new String(helloArray);
        String hello2 = new String(helloArray);

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println("hello1 == hello2 ??? " + hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

	}
}
