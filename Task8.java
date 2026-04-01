import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){
        /* Write an application that reads two integers, determines whether the 
        first is a multiple of the second and print the result. */
        Scanner sinput = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sinput.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sinput.nextInt();

        if (num1 % num2 == 0){
            System.out.printf("%d is a multiple of %d", num1, num2);
        }
        else{
            System.out.printf("%d is not a multiple of %d", num1, num2);
        }
        sinput.close();
    }
}
