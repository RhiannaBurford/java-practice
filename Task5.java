import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        /* Write an application that asks the user to enter two integers, obtains them 
        from the user and prints their sum, product, difference and quotient (division). */
        Scanner sinput = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int first = sinput.nextInt();
        System.out.println("Enter the second integer: ");
        int second = sinput.nextInt();
        int sum = first + second;
        int product = first * second;
        int difference = Math.abs(first - second);
        int quotient = first / second;
        System.out.printf("%d %d %d %d", sum, product, difference, quotient);
        sinput.close();
    }
}
