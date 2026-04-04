public class Ford extends Car{
    private int year;
    private int manuDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manuDiscount){
        super(speed, regularPrice, color);
        this.year = year;
        this.manuDiscount = manuDiscount;
    }
    
    @Override
    public double getSalePrice(){
        return (super.getSalePrice() - manuDiscount);
    }
}
