package math.problems;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int missingNumber = findMissingNumber(array);
        System.out.println("Missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] array) {
        int n = array.length + 1;
        int sumOfN = (n * (n + 1)) / 2;
        int sumOfArr = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfArr += array[i];
        }
        int missingNumber = sumOfN - sumOfArr;
        return missingNumber;
    }
}
