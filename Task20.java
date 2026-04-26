public class Task20 {
    

    public int numOccurrences(String s, char c){
        int count = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c){
                count++;
            }
        }

        return count;
    }
}
