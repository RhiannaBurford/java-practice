import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        // Write a program that calculates and prints the product of three inputted integers
        Scanner sinput = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++){
            System.out.println("Enter number " + (i+1) + ": ");
            nums[i] = sinput.nextInt();
        }
        int product = 1;
        for (int i = 0; i < nums.length; i++){
            product = product * nums[i];
        }
        System.out.println("The product is "+product);
        sinput.close();
    }
}
