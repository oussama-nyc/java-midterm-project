package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {

		int [] num = new int[10000];
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        //printValue(numbers);

		int n = num.length;
		randomize (num, n);


		//By following above, Continue for rest of the Sorting Algorithm....
        //********************************************************************************************//
		//insertionSort algorithm
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "SortingNumbers");
		List<String> numbers2 = connectToSqlDB.readDataBase("insertion_sort", "SortingNumbers");
		//printValue(numbers2);

		//********************************************************************************************//
		//bubbleSort algorithm
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "bubble_sort", "SortingNumbers");
		List<String> numbers3 = connectToSqlDB.readDataBase("bubble_sort", "SortingNumbers");
		//printValue(numbers3);
		//********************************************************************************************//
		// mergeSort algorithm
		algo.mergeSort(num);
		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in merge Sort take: " + mergeSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "merge_sort", "SortingNumbers");
		List<String> numbers4 = connectToSqlDB.readDataBase("merge_sort", "SortingNumbers");
		//printValue(numbers4);
		//********************************************************************************************//
		// quickSort algorithm
		algo.quickSort(num);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in quick Sort take: " + quickSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "quick_sort", "SortingNumbers");
		List<String> numbers5 = connectToSqlDB.readDataBase("quick_sort", "SortingNumbers");
		//printValue(numbers5);
		//********************************************************************************************//
		// heapSort algorithm
		algo.heapSort(num);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in heap Sort take: " + heapSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "heap_sort", "SortingNumbers");
		List<String> numbers6 = connectToSqlDB.readDataBase("heap_sort", "SortingNumbers");
		//printValue(numbers6);
		//********************************************************************************************//
		// bucketSort algorithm
		algo.bucketSort(num);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in bucket Sort take: " + bucketSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "bucket_sort", "SortingNumbers");
		List<String> numbers7 = connectToSqlDB.readDataBase("bucket_sort", "SortingNumbers");
		//printValue(numbers7);
		//********************************************************************************************//
		// shellSort algorithm
		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in shell Sort take: " + shellSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "shell_sort", "SortingNumbers");
		List<String> numbers8 = connectToSqlDB.readDataBase("shell_sort", "SortingNumbers");
		//printValue(numbers8);


		//Come to conclusion about which Sorting Algo is better in given data set.

		long minExecutionTime = selectionSortExecutionTime; // assume the first one is the smallest
		String minExecutionAlgorithm = "Selection Sort"; // assume the first one is the smallest

		if (insertionSortExecutionTime < minExecutionTime) {
			minExecutionTime = insertionSortExecutionTime;
			minExecutionAlgorithm = "Insertion Sort";
		}
		if (bubbleSortExecutionTime < minExecutionTime) {
			minExecutionTime = bubbleSortExecutionTime;
			minExecutionAlgorithm = "bubble Sort";
		}
		if (mergeSortExecutionTime < minExecutionTime) {
			minExecutionTime = mergeSortExecutionTime;
			minExecutionAlgorithm = "merge Sort";
		}
		if (quickSortExecutionTime < minExecutionTime) {
			minExecutionTime = quickSortExecutionTime;
			minExecutionAlgorithm = "quick Sort";
		}
		if (heapSortExecutionTime < minExecutionTime) {
			minExecutionTime = heapSortExecutionTime;
			minExecutionAlgorithm = "heap Sort";
		}
		if (bucketSortExecutionTime < minExecutionTime) {
			minExecutionTime = bucketSortExecutionTime;
			minExecutionAlgorithm = "Bucket Sort";
		}
		if (shellSortExecutionTime < minExecutionTime) {
			minExecutionTime = shellSortExecutionTime;
			minExecutionAlgorithm = "shell Sort";
		}

		System.out.println("The minimum execution time is: " + minExecutionTime + " milli sec with " + minExecutionAlgorithm);



	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(10000);
		}
	}


	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
