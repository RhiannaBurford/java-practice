import java.util.Scanner;
import java.util.InputMismatchException;

public class Exponent {
    /* Write a Java recursive method to calculate the exponentiation of a 
    number (base) raised to a power (exponent). */
    public static void main(String[] args){
        Scanner sinput = new Scanner(System.in);
        long base = -1;
        long exponent = -1;
        while (base <= 0){
            try {
                System.out.print("Enter a base: ");
                base = sinput.nextLong();
            }
            catch (InputMismatchException e){
                System.out.print("Please enter a whole number: ");
                sinput.next();
            }
        }
        
        // For simplicity we are only going to deal with positive exponents
        while (exponent < 0){
            System.out.print("Enter an exponent greater than 0: ");
            try {
                exponent = sinput.nextLong();
            }
            catch (InputMismatchException e){
                System.out.print("Please enter a whole number: ");
                sinput.next();
            }
        }
        System.out.println("The result of " + base + " raised to the power of " + exponent + " is " + exponentCalc(base, exponent));
        

        sinput.close();
    }

    public static long exponentCalc(long base, long exponent){
        if (exponent == 0){
            return 1;
        }
        else {
            return base * exponentCalc(base, exponent - 1);
        }
    }
}
