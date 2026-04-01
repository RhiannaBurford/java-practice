import java.util.Scanner;

public class Task9 {
    public static void main(String[] args){
        /*Write a Java application that inputs a series of 10 integers and determines 
        and prints the largest integer */

        // Initialise variables
        Scanner sinput = new Scanner(System.in);
        int[] nums = new int[10];
        

        // Gather user input
        for (int i = 0; i < nums.length; i++){
            System.out.print("Enter number "+ (i+1) + ": ");
            nums[i] = sinput.nextInt();
        }

        int max = nums[0];
        // Find largest integer
        for (int value : nums){
            if (value > max){
                max = value;
            }
        }

        // The two for loops could be combined

        System.out.println("The maximum is "+ max);
        sinput.close();
    }
}
