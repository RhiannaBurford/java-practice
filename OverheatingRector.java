import java.util.Random;

public class OverheatingRector {
    public static void main(String[] args){
        Random rnd = new Random();
        int dangerEvent = 0;

        for (int i = 0; i < 10; i++){
            double rand = (Math.random() * 151.0) + 200.0;
            boolean stable = rnd.nextBoolean();
            if (!stable && rand > 300.00){
                dangerEvent++;
            }
        }

        System.out.println("Number of danger events: " + dangerEvent);
    }
}
