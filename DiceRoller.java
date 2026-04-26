import java.util.Random;

public class DiceRoller {
    public static void main(String[] args){
        Random rnd = new Random();
        int roll = rnd.nextInt(6) + 1; // the bound is EXCLUSIVE, so this is the first number it cannot reach
        System.out.println(roll);
    }
}
