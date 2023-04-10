package algorithm;

import java.util.Arrays;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */
    //********************************************************************************************//
    // selectionSort algorithm
    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    //********************************************************************************************//
    //insertionSort algorithm
    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    //********************************************************************************************//
    //bubbleSort algorithm
    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        boolean isSort = false;
        int comp = 0;
        while (isSort == false) {
            isSort = true;
//            count++;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    isSort = false;
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    //********************************************************************************************//
    // mergeSort algorithm
    public  int[] mergeSort(int[] arr) {
        final long startTime = System.currentTimeMillis();
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

        left = mergeSort(left);
        right = mergeSort(right);
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return merge(left, right);

    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }

        return result;
    }
    //********************************************************************************************//
   //  quickSort algorithm

    public int[] quickSort(int[] arr) {
        final long startTime = System.currentTimeMillis();
        if (arr == null || arr.length == 0) {
            return arr;
        }
        quickSortHelper(arr, 0, arr.length - 1);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return arr;
    }

    private void quickSortHelper(int[] arr, int low, int high) {

        if (low >= high) {
            return;
        }
        int pivot = arr[low + (high - low) / 2];
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSortHelper(arr, low, j);
        }
        if (high > i) {
            quickSortHelper(arr, i, high);
        }
    }
    //********************************************************************************************//
    //heapSort algorithm
    public int [] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        int size = array.length;

        // Build heap
        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(array, size, i);

         // One by one extract (Max) an element from heap and
         // replace it with the last element in the array
        for (int i=size-1; i>=0; i--) {

          //arrA[0] is a root of the heap and is the max element in heap
            int x = array[0];
            array[0] = array[i];
            array[i] = x;

         // call max heapify on the reduced heap
            heapify(array, i, 0);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    void heapify(int arrA[], int heapSize, int i) {
        int largest = i; // Initialize largest as root
        int leftChildIdx = 2*i + 1; // left = 2*i + 1
        int rightChildIdx = 2*i + 2; // right = 2*i + 2

        if (leftChildIdx < heapSize && arrA[leftChildIdx ] > arrA[largest])
            largest = leftChildIdx ;

        if (rightChildIdx < heapSize && arrA[rightChildIdx ] > arrA[largest])
            largest = rightChildIdx ;

        if (largest != i) {
            int swap = arrA[i];
            arrA[i] = arrA[largest];
            arrA[largest] = swap;

            heapify(arrA, heapSize, largest);
        }
    }

    //********************************************************************************************//
   //bucketSort algorithm
    public int[] bucketSort(int[] array) {
        final long startTime = System.currentTimeMillis();

        // Find the maximum value in array
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Resize bucket
        int[] bucket = new int[max + 1];
        Arrays.fill(bucket, 0);

        // Count occurrences of each value in array
        for (int i = 0; i < array.length; i++) {
            bucket[array[i]]++;
        }

        // Fill array with sorted values from bucket
        int k = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                array[k++] = i;
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return array;
    }
    //********************************************************************************************//
    //shellSort algorithm
    public int [] shellSort(int [] array){
        int [] list = array;
        final long startTime = System.currentTimeMillis();
        int n = array.length;

        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                int temp = array[i];

                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap)
                    array[j] = array[j - gap];

                array[j] = temp;
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    //********************************************************************************************//
    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " , ");
        }
        System.out.println();
    }
}
