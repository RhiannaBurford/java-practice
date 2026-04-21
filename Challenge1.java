public class Challenge1 {
    public static void main(String[] args){
        /* Imagine you have an array of integers that represents a scoresheet. 
        Some scores are valid, but some are 0 (missing entries). You want to move
        all the 0s to the end of the array while keeping the relative order of the 
        non-zero numbers exactly the same. */

        int[] scores = {4, 0, 25, 35, 3, 9, 0, 2, 0, 8, 16, 0};


        /* MY INITIAL IDEA - WORKS BUT NOT EFFICIENT
        int temp = 0;

        // This works but is O(n^2) complexity
        for (int j = 1; j < scores.length; j++){
            for (int i = 0; i < scores.length - 1; i++){
  
                if (scores[i] == 0){
                // Compare with the next value
                // If the next value is not 0, swap them
                // Sort of like bubble sort? 
                    if (scores[i+1] != 0){
                        temp = scores[i+1];
                        scores[i+1] = scores[i];
                        scores[i] = temp;
                    }
                }

        }
        }
        
            */

        int anchor = 0; // Where the next non-zero number should go

    // 1. Move all non-zero numbers to the front
    for (int scout = 0; scout < scores.length; scout++) {
        if (scores[scout] != 0) {
            scores[anchor] = scores[scout];
            anchor++;
        }
    }

    // 2. Fill the remaining slots with zeros
    while (anchor < scores.length) {
        scores[anchor] = 0;
        anchor++;
    }

    for (int k = 0; k < scores.length; k++){
            System.out.println(scores[k]);
        }
    }
}
