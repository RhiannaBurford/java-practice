public class MyOwnAutoShop {
    public static void main(String[] args){
        Sedan car1 = new Sedan(45, 6875.40, "Black", 10);
        Ford car2 = new Ford(65, 40000.00, "Red", 2010, 10);
        Ford car3 = new Ford(60, 80000.00, "Blue", 2024, 15);
        Car car4 = new Car(54, 4500, "White");

        System.out.println(car1.getSalePrice());
        System.out.println(car2.getSalePrice());
        System.out.println(car3.getSalePrice());
        System.out.println(car4.getSalePrice());
    }
}
