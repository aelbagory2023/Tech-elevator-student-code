package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		Map<String, String> nameToZip = new HashMap<String, String>();
		nameToZip.put("Ahmed", "44123");


		Set<String> Keys = nameToZip.keySet();
		{
			for(String Key : Keys) {
				System.out.println("The key " + Key + " has the value of:" + nameToZip.get(Keys));
			}
		}

