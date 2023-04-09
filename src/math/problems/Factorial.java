package math.problems;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */


        int num = 5;

        //recursion
        int factRecursion = factorialUsingRecursion(num);
        System.out.println("Factorial of the given number using recursion is : " + factRecursion);

        //iteration
        int factIteration = factorialUsingIteration(num);
        System.out.println("Factorial of the given number using iteration is : " + factIteration);


    }
    // factorial iteration method :
    public static int factorialUsingRecursion(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return n * factorialUsingRecursion(n-1);
        }
    }
    // factorial Iteration method :
    public static int factorialUsingIteration(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
