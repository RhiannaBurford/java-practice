

public class ElementCount {
    /* Write a Java recursive method to count the number of occurrences 
    of a specific element in an array. */
    public static void main(String[] args){
        int[] nums = {5, 4, 6, 3, 5, 4, 3, 3, 2, 1, 9, 10, 45, 32};
        System.out.println("3 appears " + countArray(3, nums) + " times in the array");

    }

    public static int countArray(int target, int[] nums){
        return countRecursive(target, nums, 0);
    }

    public static int countRecursive(int target, int[] nums, int index){
        if (index == nums.length){
            return 0;
        }
        else if (nums[index] == target){
            return 1 + countRecursive(target, nums, index + 1);
        }
        return countRecursive(target, nums, index + 1);
    }

}
