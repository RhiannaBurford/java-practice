import java.util.List;
import java.util.ArrayList;

public class Shuffler<T> {
    private List<T> objects;

    public Shuffler(List<T> objects) {
        // Create a copy so we don't modify the original list passed in
        this.objects = new ArrayList<T>(objects);
    }

    public T retrieveNextItem() {
        // 1. Safety check (Essential for 8-mark questions)
        if (objects.isEmpty()) {
            return null; 
        }

        // 2. Pick a RANDOM index every time
        int randIdx = (int) (Math.random() * objects.size());

        // 3. Remove and return in one go
        
        // .remove(index) returns the object it just deleted
        return objects.remove(randIdx);

    }
}