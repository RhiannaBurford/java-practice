public class Practice3 {
    
    /* Rewrite the following method recursively:
    public static int sequence(int a, int b) {
        int result = a * b;
        while (b > 1) {
            b = b - 1;
            result = result + (a * b);
        }
        return result;
    } 
        
    You may assume: a is positive, b is at least 1*/


    public static int sequence(int a, int b){

        if (b == 1){
            return a * 1;
        }
        return (a * b) + sequence(a, b-1);
    }
}
