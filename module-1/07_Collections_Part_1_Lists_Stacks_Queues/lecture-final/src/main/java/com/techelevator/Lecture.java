package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		List<String> petNames = new ArrayList<String>();
		petNames.add("Patsy");
		petNames.add("Spot");
		petNames.add("Eddie");
		petNames.add("Koda");
		petNames.add("Spot");
		petNames.add("Temmy");
		petNames.add("Baadrazuhl, the swallower of worlds");
		petNames.add("Spot");

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		for(int i = 0; i < petNames.size(); i++ )
		{
			System.out.println(petNames.get(i)); //use .get(i), not [i]
		}


		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

//		petNames.add("Spot");
//		petNames.add("Spot");
//		petNames.add("Spot"); //so many dalmatians

		//NOTE: we removed this and added the Spot dogs in the original list so that they are evenly distributed

		for(int i = 0; i < petNames.size(); i++ )
		{
			System.out.println(petNames.get(i)); //use .get(i), not [i]
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		//in an array, putting something at an existing index would replace it
		//but in a list, it inserts something new, and moves the existing entry down
		petNames.add(5, "Philco");
		petNames.add(6, "Zenith");
		petNames.add(7, "Emerson");

		for(int i = 0; i < petNames.size(); i++ )
		{
			System.out.println(petNames.get(i)); //use .get(i), not [i]
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		petNames.remove("Spot"); //this removes the first "Spot" it finds in the list
		petNames.remove(3); //remove "Spot" at index 3
		petNames.remove(petNames.size() - 1); //remove the last thing in the list, which is Spot #3

		for(int i = 0; i < petNames.size(); i++ )
		{
			System.out.println(petNames.get(i)); //use .get(i), not [i]
		}

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		boolean containsLinus = petNames.contains("Linus Torvalds");
		System.out.println("Is Linus Torvalds in the list? " + containsLinus);

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int indexOfKoda = petNames.indexOf("Koda");
		System.out.println("Koda is at index: " + indexOfKoda);

		int indexOfLinusTorvalds = petNames.indexOf("Linus Torvalds");
		System.out.println("Linus Torvalds is at index: " + indexOfLinusTorvalds);


		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String[] petNamesArray = petNames.toArray(new String[0]); //pass .toArray an empty array to have it make a new array

		for(int i = 0; i < petNamesArray.length; i++ )
		{
			System.out.println(petNamesArray[i]); //brackets because this is an array
		}

		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		Collections.sort(petNames); //sorts the list into alphabetical order
		for(int i = 0; i < petNames.size(); i++ )
		{
			System.out.println(petNames.get(i)); //use .get(i), not [i]
		}

		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		Collections.reverse(petNames);
		for(int i = 0; i < petNames.size(); i++ )
		{
			System.out.println(petNames.get(i)); //use .get(i), not [i]
		}

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		for(String name : petNames) //for each name in petNames
		{
			System.out.println(name + " is a good pet name!");
		}
	}
}
