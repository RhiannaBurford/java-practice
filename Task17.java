public class Task17 {

    public char mostFrequent(String w) {
        int[] counts = new int[256];
        char winner = ' ';
        int maxCount = 0;

        // 1. Count everything
        for (int i = 0; i < w.length(); i++) {
            char current = w.charAt(i);
            counts[current]++; // Direct use of char as index
        
            // 2. Update the winner as we go (Efficiency!)
            if (counts[current] > maxCount) {
                maxCount = counts[current];
                winner = current;
            }
        }
    
        return winner;
    }
}
