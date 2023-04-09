package math.problems;

import java.util.List;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://
        // Unit Testing of PrimeNumber Class :

        int limit = 1000000;
        List<Integer> primeNumbers = PrimeNumber.getPrimeNumbers(limit);

        //Out put number of Prime numbers on the given range
        System.out.println("Prime numbers from 1 to " + limit + " are: ");
        for (int number : primeNumbers) {
            System.out.println(number);
        }
        //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://
        // Unit Testing of Pattern Class :

        System.out.println("solution of find the pattern then implement the logic from this pattern: ");
        Pattern.pattern();


        //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://
        // Unit Testing of Pyramid Class :

        System.out.println("large Pyramid of stars in the screen with java : ");
        MakePyramid.makePyramid(8);

        //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://
        // Unit Testing of LowestNumber Class :

        int[] array;
        array = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
       int lowestNumber= LowestNumber.lowestNumber(array);
        System.out.println("The Lowest Number is: "+lowestNumber);

        //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://
        // Unit Testing of FindMissingNumber Class :

        int [] testArray = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
       int missinNumber =  FindMissingNumber.findMissingNumber(testArray);
        System.out.println("Missing number is: " + missinNumber);

        //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://
        // Unit Testing of FindLowestDifference Class :

        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
        int lowestDifference = FindLowestDifference.findLowestDifference(array1, array2);
        System.out.println("The lowest difference between array cells is: "+lowestDifference);

        //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://
        // Unit Testing of Fibonacci Class :

        System.out.println("40 Fibonacci numbers is : ");
        Fibonacci.fibonacciNumbers(40);

        //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://
        // Unit Testing of Factorial Class :

        //recursion
        int factorialRecursion = Factorial.factorialUsingRecursion(5);
        System.out.println("Factorial of the given number using recursion is : " + factorialRecursion);

        //iteration
        int factorialIteration = Factorial.factorialUsingIteration(5);
        System.out.println("Factorial of the given number using iteration is : " + factorialIteration);
    }
}
