import java.util.ArrayList;
import java.util.Iterator;

public class Iterator2 {
    public static void main(String[] args){
        ArrayList<Double> prices = new ArrayList<>();
        Iterator<Double> it = prices.iterator();

        while (it.hasNext()){
            double value = it.next();
            if (value < 100.0){
                // Remove price
                it.remove(); // Don't modify the array list directly
            }
        }

    }
}
