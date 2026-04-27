import java.util.ArrayList;
import java.util.Iterator; // remember to import this library

public class Iterator3 {
    public static void main(String[] args){
        ArrayList<String> contacts = new ArrayList<String>();

        Iterator<String> it = contacts.iterator();

        while (it.hasNext()){
            String contact = it.next();
            if (contact.contains("spam") || !contact.substring(contact.length() - 3, 
            contact.length()).equals("com")){
                it.remove();
            }
        }
    }
}
