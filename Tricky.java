import java.util.Scanner;

public class Tricky {
    public static void main(String[] args){
        /* The Problem: The "Target Sum" Pair
        Imagine you have an array of integers and a "Target" number. You need to 
        determine if any two numbers in that array add up exactly to that target. */

        Scanner sinput = new Scanner(System.in);
        int[] nums = {45, 25, 34, 2, 45, 13, 42, 35};
        System.out.println("Enter target number: ");
        int target = sinput.nextInt();
        boolean foundPair = false;
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    foundPair = true;
                    num1 = nums[i];
                    num2 = nums[j];
                    break;
                }
            }
            if (foundPair){
                break;
            }
        }

        if (foundPair){
            System.out.println("Pair was found! A possible pair is "+ num1 + " and " + num2);
        }
        else {
            System.out.println("No pair was found.");
        }

        sinput.close();
    }
}
