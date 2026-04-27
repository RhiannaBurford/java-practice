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

    public String[] question2b(char[][] chArr, String s1) {
    // The result array must be the size of the number of pairs provided
    String[] toReturn = new String[chArr.length];

    // Loop through each pair in the 2D array
    for (int i = 0; i < chArr.length; i++) {
        // chArr[i][0] is the char to find, chArr[i][1] is the replacement
        // We pass these into your existing method along with s1
        toReturn[i] = question2a(chArr[i][0], chArr[i][1], s1);
    }

    return toReturn;
}
}
