import java.util.Scanner;

public class Palindrome {
    /* Write a Java recursive method to check if a given string is a palindrome. */

    public static void main(String[] args){
        Scanner sinput = new Scanner(System.in);
        System.out.println("Please enter your word: ");
        String word = sinput.nextLine().toLowerCase();
        boolean isPalindrome = isPalindrome(word);
        if (isPalindrome){
            System.out.println("That word is a palindrome!");
        }
        else {
            System.out.println("That word is NOT a palindrome!");
        }
        sinput.close();
    }

    public static boolean isPalindrome(String word){
        if (word.length() < 2){
            return true;
        }
        else if (word.charAt(0) == word.charAt(word.length() -1)){
            // remove the first and last letters of the word
            // then call the function again
            return isPalindrome(word.substring(1, word.length() -1));
        }
        return false;
    }
    
}
