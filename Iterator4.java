import java.util.LinkedList;
import java.util.Scanner;


public class Iterator4 {
    public static void main(String[] args){
        LinkedList<InventoryItem> objects = new LinkedList<>();

        Iterator<InventoryItem> it = objects.iterator();

        while (it.hasNext()){
            InventoryItem object = it.next();
            if (object.getQuantity() == 0 || object.getName().startsWith("OLD")){
                it.remove();
            }
        }

    }
}
