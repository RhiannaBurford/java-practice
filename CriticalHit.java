import java.util.Random;

public class CriticalHit {
    public static void main(String[] args){
        Random rnd = new Random();
        boolean isCritical = rnd.nextBoolean();
        double damageMultiplier1 = rnd.nextDouble() * 5.0;
        double damageMultiplier2 = (Math.random() * 5.0);

        System.out.println("First: " + damageMultiplier1 + "\nSecond: " + damageMultiplier2 + " and " + isCritical);
    }
}
