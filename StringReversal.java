import java.util.Scanner;

public class StringReversal {
    /* Write a Java recursive method to reverse a given string. */
    public static void main(String[] args){
        Scanner sinput = new Scanner(System.in);
        System.out.print("Insert a string: ");
        String word = sinput.nextLine();
        System.out.println("The reversed string is " + reverse(word));
        sinput.close();
    }

    public static String reverse(String word){
        if (word.length() <= 1){
            return word;
        }
        return word.charAt(word.length()-1) + reverse(word.substring(0, word.length()-1));

    }
}
