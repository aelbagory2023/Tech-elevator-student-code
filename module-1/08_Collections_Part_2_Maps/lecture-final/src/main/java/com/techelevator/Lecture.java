package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.util.Map.entry; //used to add multiple entries to a map when we first make it

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		//making a map with String keys and String values
		Map<String,String> nameToZip = new HashMap<String,String>();

		//put some stuff in there
		nameToZip.put("Tori", "44145");
		nameToZip.put("Joey", "44077");
		nameToZip.put("Justin", "44145");
		nameToZip.put("Ian M", "44106");
		nameToZip.put("Ian S", "44256"); //NO DUPLICATE KEYS

		System.out.println(nameToZip.get("Ian M")); //get the value for Ian M from the map and print it out
		System.out.println(nameToZip.size());

		//Retrieve just the keys from a Map
		System.out.println("Retrieving all the keys from a map:");

		Set<String> keys = nameToZip.keySet(); //the key collection comes back as a Set<T>

		for(String key : keys) //for each key in the key Set
		{
			System.out.println("The key " + key + " has the value of: " + nameToZip.get(key));
		}

		System.out.println(" -------------------------------- ");
		System.out.println(" -------------------------------- ");

		//foreach through all the key-value pairs in the map
		//for each entry of type <String, String>, named item, in the entries in the nameToZip Map
		for(Map.Entry<String,String> item : nameToZip.entrySet())
		{
			System.out.println("The key " + item.getKey() + " has the value of: " + item.getValue());
		}

		System.out.println(" -------------------------------- ");
		System.out.println(" -------------------------------- ");

		//remove someone from the map
		nameToZip.remove("Tori");

		System.out.println("Removed Tori...");
		System.out.println(" -------------------------------- ");

		for(Map.Entry<String,String> item : nameToZip.entrySet())
		{
			System.out.println("The key " + item.getKey() + " has the value of: " + item.getValue());
		}

		//ADDITIONAL INFORMATION ON CREATING MAPS
		//create a map with entries - Map.of can add up to 10 things
		Map<String,String> petNames = Map.of(
				"Philco", "cat", "Zenith", "cat", "Emerson", "cat"
		);

		//using Map.ofEntries() can add all the things you want
		Map<String,String> petNamesTwo = Map.ofEntries(
				entry("Philco", "cat"),
				entry("Zenith", "cat"),
				entry("Emerson", "cat")
		);
	}

}
