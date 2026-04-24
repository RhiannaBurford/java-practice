public class Practice4 {
    /* public static int sumEven(int[] arr, int index)
    
    Write a recursive method that returns the sum of all even numbers in the array starting from position index.*/

    public static int sumEven(int[] arr, int index){
        if (index == arr.length){
            return 0; // must return an int
        }
        else if (arr[index] % 2 == 0){
            return arr[index] + sumEven(arr, index + 1);
        }
        return sumEven(arr, index + 1);
    }
}
