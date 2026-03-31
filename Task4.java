public class Task4{
    public static void main(String[] args){
        /* 5. Write an application that displays the numbers 1 to 4 on the same line, 
        with each pair of adjacent numbers separated by one space. Write the application
        using the following techniques:  
            a. Use one System.out.println statement.  
            b. Use four System.out.print statements.  
            c. Use one System.out.printf statement 
        */
       System.out.println("1 2 3 4");
       
       for (int i = 1; i < 5; i++){
        System.out.print(i + " ");
       }
       System.out.println();

       System.out.printf("%d %d %d %d", 1, 2, 3, 4);
    }
}