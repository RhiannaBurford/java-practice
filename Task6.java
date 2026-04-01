import java.util.Scanner;

public class Task6 {
    public static void main (String[] args){
        /*Write an application that asks the user to enter two integers, obtains them
         from the user and displays the larger number followed by the words “is larger”. 
         If the numbers are equal, print “These numbers are equal” */
        Scanner sinput = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int first = sinput.nextInt();
        System.out.print("\nEnter number 2: ");
        int second = sinput.nextInt();
        if (first == second){
            System.out.println("These numbers are equal");
        }
        else if (first > second){
            System.out.println(first + " is larger");
        }
        else {
            System.out.println(second + " is larger");
        }
        sinput.close(); // remember to close scanner - it is good practice
    }
}
