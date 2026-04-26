import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args){

        String[] levels = {"Low", "Medium", "High"};
        Random rnd = new Random(); // create new object

        int index = rnd.nextInt(3);
        System.out.println(levels[index]);

    }
}
