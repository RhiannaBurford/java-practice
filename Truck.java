public class Truck extends Car{
    private int weight;

    public Truck(int speed, double regularPrice, String colour, int weight){
        super(speed, regularPrice, colour);
        this.weight = weight;
    }

    @Override
    public double getSalePrice(){
        // Use weight instead of this.weight
        if (weight > 2000){
            return super.getSalePrice() * 0.9; //10% discount
        }
        else {
            return super.getSalePrice() * 0.8; //20% discount
        }
    }
}
