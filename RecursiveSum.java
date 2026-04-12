import java.util.InputMismatchException;
import java.util.Scanner;

public class RecursiveSum {

    public static void main(String[] args){
        /* Write a Java recursive method to calculate the sum of all numbers from 1 to n. */
        Scanner sinput = new Scanner(System.in);
        long num = 0;
        while (num <= 0) {
            System.out.print("Enter a whole number greater than 0: ");
            try {
                num = sinput.nextLong(); // nextLong handles larger inputs than nextInt
                if (num <= 0) {
                    System.out.println("Please enter a positive integer.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please do not use decimals or letters.");
                sinput.next(); // Clear the invalid input from the buffer
            }
        }

        System.out.println("The sum from 1 to " + num + " is " + SumToN(num));

        sinput.close();
    }

    public static long SumToN(long num){
        if (num == 1){
            return 1;
        }
        else {
            return num + SumToN(num - 1);
        }
    }

    
}
