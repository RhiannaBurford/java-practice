import java.util.Scanner;

public class Task11 {
    public static void main(String[] args){
        Scanner sinput = new Scanner (System.in);
        System.out.print("Enter the radius of sphere: ");
        double radius = sinput.nextDouble();
       
        double volume = sphereVolumeto(radius);
        System.out.println("The volume is "+ volume);
        sinput.close();
    }
    public static double sphereVolumeto(double radius){
        return (4.0 / 3.0) * Math.PI * Math.pow(radius,3);
    }
}


