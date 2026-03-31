import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        // Write a program that converts Fahrenheit degree to Celsius degree
        Scanner sinput = new Scanner(System.in);
        System.out.print("Enter the Fahrenheit value: ");
        float fahrenheit = sinput.nextFloat();
        float celsius = (5.0f/9.0f)*(fahrenheit - 32);
        // Probably best to use double next time
        System.out.print("The value in celsius is " + celsius);
        sinput.close();
    }
}
