package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

import static algorithm.Numbers.printValue;

public class PrimeNumber {

	public static void main(String[] args) throws Exception {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		int limit = 1000000;
		List<Integer> primeNumbers = getPrimeNumbers(limit);

		//Out put number of Prime numbers on the given range
			System.out.println("Prime numbers from 1 to " + limit + " are: ");
		for (int number : primeNumbers) {
			System.out.println(number);
		}

		//Using  any MySql databases to store data and retrieve data.
		int[] primeNumbersArray = primeNumbers.stream().mapToInt(Integer::intValue).toArray();

		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		connectToSqlDB.insertDataFromArrayToSqlTable(primeNumbersArray, "prime_numbers", "SortingNumbers");
		List<String> numbers = connectToSqlDB.readDataBase("prime_numbers", "SortingNumbers");
		printValue(numbers);
	}

	public static List<Integer> getPrimeNumbers(int limit) {
		List<Integer> primeNumbers = new ArrayList<>();

		// 2 is the only even prime number
		if (limit >= 2) {
			primeNumbers.add(2);
		}

		// Check for odd prime numbers
		for (int numberToCheck = 3; numberToCheck <= limit; numberToCheck += 2) {
			boolean isPrime = true;

			// Check factors up to square root of number
			int maxFactor = (int) Math.sqrt(numberToCheck);
			for (int factor = 3; factor <= maxFactor; factor += 2) {
				if (numberToCheck % factor == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				primeNumbers.add(numberToCheck);
			}
		}

		return primeNumbers;
	}
}
