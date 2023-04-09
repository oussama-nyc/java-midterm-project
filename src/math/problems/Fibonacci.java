package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int num = 40;
       System.out.println("40 Fibonacci numbers: ");
        fibonacciNumbers(num);
    }

    public static void fibonacciNumbers(int num) {
        int temp1 = 0;
        int temp2 = 0;
        int currentNum = 0;
        int total = 0;

        for (int i = 0; i < num; i++) {

            if (currentNum <= 1) {
                temp1 = currentNum;
                System.out.print(temp1 + " , ");
                currentNum++;
            } else {
                total = temp1 + temp2;
                System.out.print(total + " , ");
                temp2 = temp1;
                temp1 = total;
            }

        }
        System.out.println();
    }
}



