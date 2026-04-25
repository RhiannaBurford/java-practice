public class Task19 {

    // count is not returned
    // .length() is used for strings, .length is used for arrays
    // should be i < ... not i == 
    // other problems as well...

    public static int countEven(int[] numList){
        int count = 0;
        for (int i = 0; i < numList.length; i++){
            if (numList[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }


    public static int countEvenWhile(int[] numList){
        int count = 0;
        int index = 0;
        while (index < numList.length){
            if (numList[index] % 2 == 0){
                count++;
            }
            index++;
        }
        return count;
    }
}
