package com.techelevator;

import classes.Person; //importing the Person class from the 'classes' package so that we can use it
import classes.Pet;

import java.util.ArrayList;
import java.util.List;

public class program {

	public static void main(String[] args) {

		//making Person objects to represent the Tech Elevator CLE instructors
		Person javaInstructor = new Person("Tori", "Brenneison", 21);
		Person dotnetInstructor = new Person("Lori", "Somerville", 21);
		Person thirdInstructor = new Person("Ben", "Langhinrichs", 60);

		//make Person objects for the other Tech Elevator CLE staff
		//Chelsea Cooper is also 21
		Person pathwayInstructor = new Person("Chelsea", "Cooper", 21);
		//so is Kaitlin Jocke
		Person alumniInstructor = new Person("Kaitlin", "Jocke", 21);
		//John Savage is 64
		Person campusDirector = new Person("John", "Savage", 64);


		//making a handy list of all the staff
		List<Person> listOfTechElevatorStaff = new ArrayList<Person>();

		listOfTechElevatorStaff.add(javaInstructor);
		listOfTechElevatorStaff.add(dotnetInstructor);
		listOfTechElevatorStaff.add(thirdInstructor);
		//add the staff created above to the list of TE staff
		listOfTechElevatorStaff.add(pathwayInstructor);
		listOfTechElevatorStaff.add(alumniInstructor);
		listOfTechElevatorStaff.add(campusDirector);


		//use the setter for "workplace" to make all the staff work at Tech Elevator
		for(Person individual : listOfTechElevatorStaff) {
			individual.setWorkplace("Tech Elevator");
		}

		Person david = new Person("David", "Ferriera", 33, "Zoopla");
		//copy the value for 'dotnetInstructor' into a new variable
		Person lori = dotnetInstructor; //just so that we don't lose Lori to the garbage collector
		dotnetInstructor = david;



		//loop through the staff to print out their information
		for(Person individual : listOfTechElevatorStaff) {
			System.out.println(individual.toString());
		}

		System.out.println("************************************");

		//make Ben have a birthday - by calling the haveBirthday() method for the object representing Ben
		thirdInstructor.haveBirthday();

		//print out Ben's age after having a birthday
		System.out.println("Ben is now " + thirdInstructor.getAge() + " years old.");

		//Put all the other Tech Elevator instructors on Ben's list of friends
		thirdInstructor.addFriend(javaInstructor);
		thirdInstructor.addFriend(dotnetInstructor);
		thirdInstructor.addFriend(lori);

		//Print out all of Ben's friends!
		//Make this work by adding a getter for firstName, then uncommenting the line in the loop body
		for(Person friend : thirdInstructor.getFriends()) {
			System.out.println(String.format("%s is Ben's friend!", friend.getFirstName()));
		}

		System.out.println("************************************");

		//make some cat objects for Tori
		Pet philco = new Pet("Philco", "cat");
		Pet zenith = new Pet("Zenith", "cat");
		Pet emerson = new Pet("Emerson", "cat");

		//make another cat, Tasha (for Ben)
		Pet tasha = new Pet("Tasha", "cat");

		javaInstructor.addPet(philco);
		javaInstructor.addPet(zenith);
		javaInstructor.addPet(emerson);

		//add Tasha to Ben's list of pets
		thirdInstructor.addPet(tasha);

		//print out Tori's list of pets
		for(Pet cat : javaInstructor.getPets()) {
			System.out.println(String.format("Tori has a %s named %s", cat.getType(), cat.getName()));
		}

		//print out what kind of pet Ben has and what the pet's name is
		System.out.println("Ben has a " + tasha.getType() + " named " + tasha.getName());

		//uncomment these two lines to include a fun console app that builds a person object
		PersonBuilderApp consoleApp = new PersonBuilderApp();
		consoleApp.RunApp();
	}

}