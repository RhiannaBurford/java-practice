import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args){
        Scanner sinput = new Scanner(System.in);
        System.out.println("Enter grade: ");
        char grade = sinput.nextLine().charAt(0);

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Fair");
                break;
            default:
                System.out.println("Invalid");
                break;
        }


        sinput.close();
    }
}
