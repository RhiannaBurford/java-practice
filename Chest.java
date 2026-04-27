public class Chest<T> {

    // Generic class
    private T collectible;
    private double amount;

    public Chest(T collectible, double amount){
        this.collectible = collectible;
        this.amount = amount;
    }

    public T getCollectible(){
        return collectible;
    }
    public double getAmount(){
        return amount;
    }
    public void setCollectible(T collectible){
        this.collectible = collectible;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }

    public void addFunds(Wallet w){
        int amount = c.getAmount();
        if (collectible instanceof Gems){
            w.gemCount = w.gemCount + amount;
        }
        else if (type instanceof Coins){
            w.coinCount = w.coinCount + amount;
        }
        else if (type instanceof Gold){
            w.goldCount = w.goldCount + amount;
        }
    }
}
