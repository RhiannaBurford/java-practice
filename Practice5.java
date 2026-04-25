public class Practice5 {
    /* public static int countChar(String s, char c)

    Recursive method that returns how many times character c appears in the string s.*/

    public static int countChar(String s, char c){
        if (s.length() == 0){
            return 0;
        }
        else if (s.charAt(0) == c){
            return 1 + countChar(s.substring(1), c);
        }
        return countChar(s.substring(1), c);
    }
}
