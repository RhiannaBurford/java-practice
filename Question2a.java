public class Question2a {
    
    public String question2a(char c1, char c2, String s1){
        String new1 = "";
        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) == c1){
                new1 = new1  + c2;
            }
            else {
                new1 = new1 + s1.charAt(i);
            }
        }
        return new1;
    }
}
