package datastructure;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import databases.ConnectToSqlDB;
public class DataReader {

	public static void main(String[] args) throws Exception {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String filePath = System.getProperty("user.dir") + "/src/data/self-driving-car";
		LinkedList<String> linkedList = new LinkedList<>();
		Stack<String> stack = new Stack<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] words = line.split(" ");
				for (String word : words) {
					linkedList.add(word);
					stack.push(word);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

        // Store each word in the linkedList to the database
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		String separatedString = String.join(",", linkedList);
		connectToSqlDB.insertDataFromStringToSqlTable(separatedString, "tbl_datareader", "SortingNumbers");

		// Retrieve the stored data from the database and print to console
		List<String> datareader = connectToSqlDB.readDataBase("tbl_datareader", "SortingNumbers");
		System.out.println("Retrieving data from database:");
		for (String word : datareader) {
			System.out.print(word + " ");
		}
		System.out.println();

		// Retrieve from LinkedList as FIFO order
		System.out.println("Retrieving from LinkedList (FIFO order):");
	    for (String word : linkedList) {
		System.out.println(word);
	    }

		// Retrieve from Stack as FILO order
	    System.out.println("Retrieving from Stack (FILO order):");
	     while (!stack.empty()) {
		System.out.println(stack.pop());
	    }

		//Demonstrate how to use Stack:

				Stack myStack = new Stack<>();

        // Push elements to the stack
		myStack.push("Element 1");
		myStack.push("Element 2");
		myStack.push("Element 3");
		myStack.push("Element 4");
		myStack.push("Element 5");
		System.out.println("Print the stack");
		System.out.println(myStack);


        // Peek at the top element of the stack
		System.out.println("Peek at the top element of the stack: ");
		System.out.println(myStack.peek());

		// Search for an element in the stack
		System.out.println("Search for an element in the stack:");
		System.out.println(myStack.search("Element 4"));


         //# Pop an element from the stack
		System.out.println("Pop an element from the stack:");
		System.out.println(myStack.pop());

		// iterating over the stack using for-each loop
		System.out.println("Elements in Stack (FIFO order):");
		for (Object element : myStack) {
			System.out.println(element);
		}

		// iterating over the stack using while loop and iterator
		System.out.println("Elements in Stack (LIFO order):");
		while (!myStack.isEmpty()) {
			Object element = myStack.pop();
			System.out.println(element);
		}
	}
}