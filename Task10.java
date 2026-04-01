public class Task10 {
    public static void main(String[] args){
        /* Printing specific table of values */
        System.out.println("N    10*N    100*N    1000*N");
        for (int i = 1; i < 6; i++){
            System.out.printf("%-5d %-5d %-5d %-5d%n", i, i*10, i*100, i*1000);

        }
    }
}
