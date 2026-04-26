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


    public char maxTwoString(String s1, String s2) {
    // We need to keep track of the best one we've found so far
    char maxChar = ' '; 
    int maxCount = -1;

    for (int i = 0; i < s2.length(); i++) {
        char currentChar = s2.charAt(i);
        
        // 1. USE the method from part (a)
        int currentCount = numOccurrences(s1, currentChar);

        // 2. Check if this is the new "winner"
        if (currentCount > maxCount) {
            maxCount = currentCount;
            maxChar = currentChar;
        }
    }

    return maxChar;
}
}
