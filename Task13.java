import java.util.Scanner;

public class Task13 {
    public static void main(String[] args){
        /*  Write a Java program that reads a string from the keyboard, and outputs 
        the string twice in a row, first all uppercase and next all lowercase. If, 
        for instance, the string “Hello" is given, the output will be “HELLOhello" */
        Scanner sinput = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sinput.nextLine();
        System.out.println(input.toUpperCase() + input.toLowerCase());
        sinput.close();
    }
}
