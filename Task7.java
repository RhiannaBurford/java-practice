import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        /* Write an application that inputs three integers from the user and 
        displays the sum, average, product, smallest and largest of the numbers */
        Scanner sinput = new Scanner(System.in);
        int[] nums = new int[3];
        // Getting user input
        for (int i = 0; i < nums.length; i++){
            System.out.println("Enter number "+ (i+1) + ": ");
            nums[i] = sinput.nextInt();
        }

        int sum = 0;
        int product = 1;
        int min = nums[0];
        int max = nums[0];
        int value;

        // Could also use ternary operators
        for (int i = 0; i < nums.length; i++){
            value = nums[i];
            sum = sum + value;
            product = product * value;
            if (value < min){
                min = value;
            }
            if (value > max){
                max = value;
            }
        }

        System.out.println("The sum is "+ sum + " and the average is "+(sum/3.0)+
        " and the product is "+ product + " and the largest is "+max+" and the smallest is "+min);
        sinput.close();
    }
}
