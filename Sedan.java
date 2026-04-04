public class Sedan extends Car{
    private int length;

    public Sedan(int speed, double regularPrice, String colour, int length){
        super(speed, regularPrice, colour);
        this.length = length;
    }

    public double getSalePrice(){
        if (length > 20){
            return super.getSalePrice() * 0.95; // 5% discount
        }
        else {
            return super.getSalePrice() * 0.90; // 10% discount
        }
    }
}
