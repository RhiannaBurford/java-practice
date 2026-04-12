import java.util.Scanner;


public class Factorial {
    public static void main(String[] args){
        /* Write a Java recursive method to calculate the factorial 
        of a given positive integer. */
        Scanner sinput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = -1;
        while (num < 0){
            System.out.print("Enter a positive number: ");
            num = sinput.nextInt();
        }
        
        long result = factorial(num);
        System.out.println("The factorial of that number is " + result);
        sinput.close();
    }

    public static long factorial(long num){
        if (num == 0){
            return 1; // Base case
        }
        else{
            return num * factorial(num - 1);
        }
    }

}



