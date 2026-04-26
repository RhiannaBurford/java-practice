

public class LootBox {
    public static void main(String[] args){

        double random = Math.random();
        if (random < 0.20){
            System.out.println("You found a Golden item!");
        }
        else if (random < 0.50){
            System.out.println("You found a Rare item!");
        }
        else {
            System.out.println("You found a common item!");
        }
    }
}
