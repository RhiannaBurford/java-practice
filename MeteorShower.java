import java.util.Random;

public class MeteorShower {
    public static void main(String[] args){
        Random rnd = new Random();

        int impact = rnd.nextInt(401) + 100;
        double intensity = Math.random() * 75.0;
        boolean warning = rnd.nextBoolean();
        
        if (impact > 400 && intensity > 50.0){
            System.out.println("MAJOR IMPACT");
        }
        else {
            System.out.println("Minor impact");
        }
    }
}
