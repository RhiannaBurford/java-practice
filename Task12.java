
public class Task12 {
    public static void main(String[] args){
        /* Write statements that perform the following one‐dimensional‐array operations: 
            d. Set the 10 elements of integer array counts to zero. 
            e. Add one to each of the 15 elements of integer array bonus. 
            f. Display the five values of integer array bestScores in column format.  
        */
       // Set the 10 elements of integer array counts to zero. 
       int[] counts = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
       
       // Add one to each of the 15 elements of integer array bonus
       int[] bonus = new int[15];
       for (int i = 0; i < bonus.length; i++){
        bonus[i] ++;
       }

       // Display the five values of integer array bestScores in column format
       int[] bestScores = {45, 65, 24, 64, 89};
       for (int i = 0; i < 5; i++){
        System.out.printf("%d\t",bestScores[i]);
       }
    }
}
