import java.util.Scanner;

public class Task14 {
    public static void main(String[] args){
        /*  Write a Java application that allows the user to enter up to 20 integer grades 
        into an array. Stop the loop by typing in ‐1. Your main method should call an Average 
        method that returns the average of the grades. */
        Scanner sinput = new Scanner(System.in);
        int[] nums = new int[20];
        int num = 0;
        int count = 0;
        while (num != -1 && count < 20){
            System.out.print("Enter number (or -1 to cancel): ");
            num = sinput.nextInt();
            if (num != -1){
                nums[count] = num;
                count++;
            }
        }
        System.out.printf("%.2f", Average(nums, count));
        sinput.close();
    }

    public static double Average(int[] nums, int count){
        double sum = 0.0;
        for (int i = 0; i < count; i++){
            sum = sum + nums[i];
        }
        return sum / (count);
    }
}
