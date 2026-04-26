import java.util.LinkedList;
import java.util.List;

public class ShufflerNext {
    public static void main(String[] args){
        String object1 = "Card";
        String object2 = "Lottery";
        String object3 = "Raffle";
        List<String> strings = new LinkedList<>();
        strings.add(object1);
        strings.add(object2);
        strings.add(object3);
        Shuffler<String> shuffler = new Shuffler<>(strings);

        String retrieve = shuffler.retrieveNextItem();
        System.out.println(retrieve);
    }
}
