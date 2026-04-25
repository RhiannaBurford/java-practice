import java.util.List;
import java.util.LinkedList;

public class Practice2 {
    /* Write a method that takes an array of Strings, arr, and returns the 
    character that appears in the highest number of Strings. */

    public char mostOften(String[] arr){
        int[] chars = new int[256];

        for (int i = 0; i < arr.length; i++){ // Go through every word in the array
            boolean[] seen = new boolean[256];
            for (int j = 0; j < arr[i].length(); j++){ // Go through every letter in each word in the array
                int index = arr[i].charAt(j);
                if (seen[index] == false){
                    seen[index] = true;
                    chars[index]++;
                }
            }
        }

        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < chars.length; i++){
            if (chars[i] > max){
                max = chars[i];
                maxIndex = i;
            }
        }

        char character = (char) maxIndex;
        return character;
    }
}
