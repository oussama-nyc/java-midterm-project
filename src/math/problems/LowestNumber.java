package math.problems;
import databases.ConnectToSqlDB;
import java.util.ArrayList;
import java.util.List;
import static algorithm.Numbers.printValue;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */

		//find the lowest number from this array by using lowestNumber() mothed :

		int[] array;
		array = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
		System.out.println("Lowest Number in the array is " + lowestNumber(array));


		// using mysql databases to store and to retrieve:
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		List<String> lowestValue = new ArrayList<>();
		try {
			connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_lowestNumber", "SortingNumbers");
			lowestValue = connectToSqlDB.readDataBase("tbl_lowestNumber", "SortingNumbers");
			printValue(lowestValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_lowestNumber) and displaying to the console");
		for (String st : lowestValue) {
			System.out.println(st);
		}

	}

	//find Lowest number from the array method :
	public static int lowestNumber(int[] array) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min)
				min = array[i];
		}
		return min;
	}
}
