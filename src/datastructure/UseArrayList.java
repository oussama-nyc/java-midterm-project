package datastructure;
import databases.ConnectToSqlDB;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static algorithm.Numbers.printValue;

public class UseArrayList {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		ArrayList<String> animals = new ArrayList<>();

		// adding elements
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Horse");
		animals.add("Lion");
		animals.add("tiger");
		animals.add("Giraffe");
		animals.add("koala");

		//removing element
		animals.remove(6);

		// retrieving element
		System.out.println("The element at index (3) is = "+ animals.get(3));

		//using for each loop
		System.out.println("Print all the elements of an ArrayList (using for each loop)");
		for (String animal : animals) {
			System.out.println(animal);
		}

		// while loop with Iterator to retrieve data
		System.out.println("while loop with Iterator to retrieve data:");
		Iterator<String> iterator = animals.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		// Store all the sorted data into one of the databases.
		// using mysql databases to store and to retrieve:

		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

		StringBuilder stringBuilder = new StringBuilder();
		for (String element : animals) {
			stringBuilder.append(element);
			stringBuilder.append(",");
		}
		stringBuilder.deleteCharAt(stringBuilder.length() - 1); // deleting the ","

		String separatedString = stringBuilder.toString();

		connectToSqlDB.insertDataFromStringToSqlTable(separatedString, "tbl_animals", "SortingNumbers");
		List<String> animalsRead = connectToSqlDB.readDataBase("tbl_animals", "SortingNumbers");
	    printValue(animalsRead);


	}
}


