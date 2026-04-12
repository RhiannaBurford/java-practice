import java.util.Scanner;
import java.util.InputMismatchException;

public class Fibonacci {
    /* Write a Java recursive method to calculate the nth Fibonacci number. */
    public static void main(String[] args){
        // Get user input
        Scanner sinput = new Scanner(System.in);
        long n = 0; 
        while (n <= 0){
            try{
                System.out.println("Enter a whole number greater than 0: ");
                n = sinput.nextLong();
            }
            catch (InputMismatchException e){
                System.out.println("ERROR - you must enter a whole number!");
                sinput.next(); // This clears the bad input
            }
        }
        System.out.println("The " + n + "th Fibonacci number is " + fibonacci(n));

        sinput.close();
    }

    public static long fibonacci(long n){
        if (n == 1){
            return 0;
        }
        else if (n == 2){
            return 1;
        }
        else{
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }
}
