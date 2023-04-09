package datastructure;
import databases.ConnectToSqlDB;

import java.util.*;

import static algorithm.Numbers.printValue;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		// create a hashmap
		Map<String, Integer> languages = new HashMap<>();

		// add elements to hashmap
		languages.put("Java", 17);
		languages.put("PHP", 8);
		languages.put("C++", 20);
		languages.put("JavaScript", 12);
		languages.put("Python", 2);
		System.out.println("HashMap: " + languages);

		// Retrieve a value from the map using its key
		int javaVersion = languages.get("Java");
		System.out.println("Java version is " + javaVersion);

		// Update a value in the map using its key
		languages.put("Python", 3);

		// Retrieve all keys from the map
		Set<String> keys = languages.keySet();
		System.out.println("Keys: " + keys);

		// Retrieve all values from the map
		Collection<Integer> values = languages.values();
		System.out.println("Values: " + values);

		// Iterate over all key-value pairs in the map
		for (Map.Entry<String, Integer> entry : languages.entrySet()) {
			String languageName = entry.getKey();
			int languageVersion = entry.getValue();
			System.out.println(languageName + " Version " + languageVersion);
		}

		//Create an Iterator for the keys in the Map
		Iterator<String> iterator = languages.keySet().iterator();
		// Use a while loop and the Iterator to retrieve the data
		System.out.println("while loop and the Iterator to retrieve the data:");
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}

		// Create a new map of strings to lists of strings
		Map<String, List<String>> listMap = new HashMap<String, List<String>>();
		// Add some key-value pairs to the list map
		List<String> aliceList = new ArrayList<String>();
		aliceList.add("apple");
		aliceList.add("banana");
		aliceList.add("cherry");
		listMap.put("Alice", aliceList);

		List<String> bobList = new ArrayList<String>();
		bobList.add("orange");
		bobList.add("pear");
		listMap.put("Bob", bobList);




	}
}


