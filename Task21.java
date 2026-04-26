public class Task21 {

    public char[] highest(String s1, String[] strArr){
        String word = "";
        char[] toReturn = new char[strArr.length];

        for (int i = 0; i < strArr.length; i++){
            word = strArr[i];
            toReturn[i] = maxTwoString(word, s1);
        }


        return toReturn;
    }
}
