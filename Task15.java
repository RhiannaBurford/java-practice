public class Task15{
    public int creditScaler(long a) {
    // 1. Efficiency: Calculate the result of the expression once
    // 2. Correctness: Cast to int to solve the narrowing conversion error
    int rem = (int)((a + 5) % 200);
    
    // 3. Readability & Efficiency: Use a switch
    switch (rem) {
        case 0:  return 5;
        case 1:  return 8;
        case 2:  return 10;
        default: 
        //hello
            // Handles everything >= 3 and negative results
            // alternatively you can use an array
            return 12; 
    }
}
}