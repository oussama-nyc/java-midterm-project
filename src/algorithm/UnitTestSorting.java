package algorithm;

import org.junit.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
     //********************************************************************************************//
        // selectionSort algorithm
        //Create Sort object
        Sort selection = new Sort();
        //apply unsorted array to selectionSort.
        selection.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        System.out.println("apply unsorted array to selectionSort:");
        try {
            Assert.assertArrayEquals("Arrays are not equal",sortedArray, unSortedArray);
            System.out.println("Arrays are equal");
        } catch (AssertionError ex) {
            System.out.println("Arrays are not equal: " + ex.getMessage());
        }
        Sort.printSortedArray(selection.selectionSort(unSortedArray));
        //Now implement Unit test for rest of the soring algorithm...................below
        //********************************************************************************************//
        //insertionSort algorithm
        //Create Sort object
        Sort insertion = new Sort();
        //apply unsorted array to insertionSort.
        insertion.insertionSort(unSortedArray);
        //verify if the unsorted array is sorted by the insertionSort  algorithm.
        System.out.println("apply unsorted array to insertionSort:");
        try {
            Assert.assertArrayEquals("Arrays are not equal",sortedArray, unSortedArray);
            System.out.println("Arrays are equal");
        } catch (AssertionError ex) {
            System.out.println("Arrays are not equal: " + ex.getMessage());
        }
        Sort.printSortedArray(insertion.insertionSort(unSortedArray));
        //********************************************************************************************//
          //bubbleSort algorithm
        //Create Sort object
        Sort bubble = new Sort();
        //apply unsorted array to bubbleSort.
        bubble.bubbleSort(unSortedArray);
        //verify if the unsorted array is sorted by the bubbleSort  algorithm.
        System.out.println("apply unsorted array to bubbleSort:");
        try {
            Assert.assertArrayEquals("Arrays are not equal",sortedArray, unSortedArray);
            System.out.println("Arrays are equal");
        } catch (AssertionError ex) {
            System.out.println("Arrays are not equal: " + ex.getMessage());
        }
        Sort.printSortedArray(bubble.bubbleSort(unSortedArray));
        //********************************************************************************************//
        //mergeSort algorithm
        //Create Sort object
        Sort merge = new Sort();
        //apply unsorted array to mergeSort.
        merge.mergeSort(unSortedArray);
        //verify if the unsorted array is sorted by the mergeSort  algorithm.
        System.out.println("apply unsorted array to mergeSort:");
        try {
            Assert.assertArrayEquals("Arrays are not equal",sortedArray, unSortedArray);
            System.out.println("Arrays are equal");
        } catch (AssertionError ex) {
            System.out.println("Arrays are not equal: " + ex.getMessage());
        }

        Sort.printSortedArray(merge.bubbleSort(unSortedArray));
        //********************************************************************************************//
        //quickSort algorithm
        //Create Sort object
        Sort quick = new Sort();
        //apply unsorted array to quickSort.
        quick.quickSort(unSortedArray);
        //verify if the unsorted array is sorted by the quickSort  algorithm.
        System.out.println("apply unsorted array to quickSort:");
        try {
            Assert.assertArrayEquals("Arrays are not equal",sortedArray, unSortedArray);
            System.out.println("Arrays are equal");
        } catch (AssertionError ex) {
            System.out.println("Arrays are not equal: " + ex.getMessage());
        }

        Sort.printSortedArray(quick.quickSort(unSortedArray));

        //********************************************************************************************//
        //heapSort algorithm
        //Create Sort object
        Sort heap = new Sort();
        //apply unsorted array to heapSort.
        heap.heapSort(unSortedArray);
        //verify if the unsorted array is sorted by the heapSort  algorithm.
        System.out.println("apply unsorted array to heapSort:");
        try {
            Assert.assertArrayEquals("Arrays are not equal",sortedArray, unSortedArray);
            System.out.println("Arrays are equal");
        } catch (AssertionError ex) {
            System.out.println("Arrays are not equal: " + ex.getMessage());
        }

        Sort.printSortedArray(heap.heapSort(unSortedArray));
        //********************************************************************************************//
        //bucketSort algorithm
        //Create Sort object
        Sort bucket = new Sort();
         // apply unsorted array to bucketSort.
        bucket.bucketSort(unSortedArray);
        //verify if the unsorted array is sorted by the bucketSort algorithm.
        System.out.println("apply unsorted array to bucketSort:");
        try {
            Assert.assertArrayEquals("Arrays are not equal",sortedArray, unSortedArray);
            System.out.println("Arrays are equal");
        } catch (AssertionError ex) {
            System.out.println("Arrays are not equal: " + ex.getMessage());
        }

        Sort.printSortedArray(bucket.bucketSort(unSortedArray));
        //********************************************************************************************//
        //shellSort algorithm
        //Create Sort object
        Sort shell = new Sort();
        // apply unsorted array to shellSort.
        shell.shellSort(unSortedArray);
        //verify if the unsorted array is sorted by the shellSort  algorithm.
        System.out.println("apply unsorted array to shellSort:");
        try {
            Assert.assertArrayEquals("Arrays are not equal",sortedArray, unSortedArray);
            System.out.println("Arrays are equal");
        } catch (AssertionError ex) {
            System.out.println("Arrays are not equal: " + ex.getMessage());
        }

        Sort.printSortedArray(shell.shellSort(unSortedArray));

    }
}
