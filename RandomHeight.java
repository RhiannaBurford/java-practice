import java.util.Random;

public class RandomHeight {
    public static void main(String[] args){
        Random rnd = new Random();
        
        int scoreA = (int)(Math.random() * 31) + 20;
        int scoreB = rnd.nextInt(31) + 20;

        System.out.println("First method: " + scoreA + "\nSecond method: " + scoreB);

    }
}
