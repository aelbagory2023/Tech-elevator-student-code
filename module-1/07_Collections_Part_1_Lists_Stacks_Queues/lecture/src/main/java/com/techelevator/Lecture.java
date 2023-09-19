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
		petNames.add("patsy");
		petNames.add("Eddie");
		petNames.add("koda");



		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");
		for(int i = 0; i <petNames.size(); i++) {
			System.out.println(petNames.get(i));
		}


		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		petNames.add("Spot");
		petNames.add("Spot");
		petNames.add("Spot");

		for(int i = 0; i <petNames.size(); i++) {
			System.out.println(petNames.get(i));
		}


		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		petNames.add(5, "philco");
		petNames.add(6, "Zenith");
		petNames.add(7, "Emerson");
			for(int i = 0; i <petNames.size(); i++) {
				System.out.println(petNames.get(i));

			}

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");
		petNames.remove(3);
		petNames.remove("Spot");
		petNames.remove(petNames.size() - 1);
		for(int i = 0; i <petNames.size(); i++) {
			System.out.println(petNames.get(i));

		}

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		 boolean containsLinus = petNames.contains("Linus Tovald");
		 System.out.println("Is Linus Torvald in the list ?" + containsLinus);


		for(int i = 0; i <petNames.size(); i++) {
			System.out.println(petNames.get(i));

		}


		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int indexOfKoda = petNames.indexOf("koda");
		System.out.println("koda is at index:" + indexOfKoda);


		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String[] petNamesArray = petNames.toArray(new String[0]);
		for(int i = 0; i < petNamesArray.length; i++) {
			System.out.println(petNamesArray[i]);

		}



		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		Collections.sort(petNames);
		for(int i = 0; i <petNames.size(); i++) {
			System.out.println(petNames.get(i));

		}



		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");
		Collections.reverse(petNames);
		for(int i = 0; i <petNames.size(); i++) {
			System.out.println(petNames.get(i));

		}



		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		for(String name : petNames){
			System.out.println(name + " is a good Pet name!");
		}


	}
}







