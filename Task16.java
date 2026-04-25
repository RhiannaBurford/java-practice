public class Task16{

    public static void main(String[] args){
        System.out.println(cypher(7, 5));
    }

    public static char cypher(int a, int b){
        if (a < 3)
            b = b - 5;
        else if (a > 8)
            if (a >= 10)
                b = b + 10;
            else if (a < b)
                b = a;
        else 
            b = 0;

        if (b < 4)
            return 'a';
        else
            return 'b';
    }
}