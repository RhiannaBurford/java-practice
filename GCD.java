import java.util.Scanner;
import java.util.InputMismatchException;

public class GCD {
    /* Write a Java recursive method to find the greatest common divisor (GCD) of two numbers */
    public static void main(String[] args){
        Scanner sinput = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        while (num1 <= 0){
            try {
                System.out.print("Enter number 1: ");
                num1 = sinput.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("ERROR: Not a valid type!");
                sinput.next();
            }
        }
        while (num2 <= 0){
            try {
                System.out.print("Enter number 2: ");
                num2 = sinput.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("ERROR: Not a valid type!");
                sinput.next();
            }
        }

        System.out.println("The GCD of these numbers is " + gcd(num1, num2));
        sinput.close();
    }

    public static int gcd(int num1, int num2){
        if (num2 == 0){
            return num1;
        }
        else {
            return gcd(num2, num1 % num2);
        }
    }
}
