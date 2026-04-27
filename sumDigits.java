public class sumDigits {

    public int sumDigits(int i){

        if (i < 10){
            return i;
        }
        else {
            return (i % 10) + sumDigits(i / 10);
        }
    }
}
