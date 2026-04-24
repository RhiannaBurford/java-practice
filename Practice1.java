public class Practice1 {
    public static int countChar(String s, char target){
        int count = 0;
        if (s == null){
            return count;
        }
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == target){
                count++;
            }
        }
        return count;
    }
}
