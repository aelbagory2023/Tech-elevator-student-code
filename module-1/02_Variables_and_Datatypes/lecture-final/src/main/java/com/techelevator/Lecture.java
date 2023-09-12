package com.techelevator;

public class Lecture {

	public static void main(String[] args) {
		
		/*
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
			I can add more lines to this comment!
		*/
		int numberOfExercises = 26;
		System.out.println(numberOfExercises);

		/*
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/
		double half = 0.5;
		System.out.println(half);

		/*
		3. Create a variable to hold a String and call it name.
			Set it to "Tech Elevator".
		*/

		String name = "Tech Elevator";
		System.out.println(name);

		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/

		byte seasonsOfFirefly = 1;
		System.out.println(seasonsOfFirefly);

		int someOtherVariable = 2;

		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/

		String myFavoriteLanguage = "Java";
		System.out.println(myFavoriteLanguage);

		/*
		6. Create a variable called pi and set it to 3.1416.
		*/

		float pi = 3.1416F;
		System.out.println(pi);

		/*
		7. Create and set a variable that holds your name.
		*/

		String myName = "Tori";
		System.out.println(myName);

		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/
		int numberOfMouseButtons = 5;
		System.out.println(numberOfMouseButtons);

		/*
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/

		int batteryPercentage = 96;
		System.out.println(batteryPercentage);

		/*
		10. Create an int variable that holds the difference between 121 and 27.
		*/
		int difference = 121 - 27;
		System.out.println(difference);

		/*
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/
		double addition = 12.3 + 32.1;
		System.out.println(addition);

		/*
		12. Create a String that holds your full name.
		*/
		String myFullName = "Tori Brenneison";

		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/

		String concat = "Hello, " + myFullName;
		System.out.println(concat);

		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/

		myFullName = myFullName + " Esquire";
		//the value of 'myFullName' is still "Tori Brenneison" up until the semicolon
		//I don't need to say "String" again because myFullName is already a String variable
		//I can reset the value of the myFullName variable as many times as I want

		System.out.println(myFullName);

		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/
		myFullName += " Esquire";
		System.out.println(myFullName);

		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/
		String movie = "Saw" + " " + 2; //the compiler coerces the 2 into a string to make it work
		System.out.println(movie);

		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/
		movie = movie + 0;
		System.out.println(movie);

		/*
		18. What is 4.4 divided by 2.2?
		*/


		/*
		19. What is 5.4 divided by 2?
		*/

		/*
		20. What is 5 divided by 2?
		*/

		/*
		21. What is 5.0 divided by 2?
		*/

		/*
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/
		double divide = 66.6 / 100;
		System.out.println(divide);

		/*
		23. If I divide 5 by 2, what's my remainder?
		*/
		int remainder = 5 % 2;  //"mod" -- what is the remainder of 5 / 2?
		System.out.println(remainder);

		/*
		24. What is 1,000,000,000 * 3?
		*/
		//int multiply = 1000000000 * 3;
		long multiply = 1000000000L * 3;
		System.out.println(multiply);

		/*
		25. Create a variable that holds a boolean called isDoneWithExercises and
		set it to false.
		*/
		boolean isDoneWithExercises = false;
		System.out.println(isDoneWithExercises);

		/*
		26. Now set isDoneWithExercises to true.
		*/
		isDoneWithExercises = true;
		System.out.println(isDoneWithExercises);

		
	}

}
