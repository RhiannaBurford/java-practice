import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        double num2 = scanner.nextDouble();
        scanner.nextLine();
        String word = scanner.nextLine();
        System.out.println("String: " + word);
        System.out.println("Double: " + num2);
        System.out.println("Int: " + num1);
        scanner.close();
    }
}