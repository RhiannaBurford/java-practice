public class Book1 extends MediaItem {

    public Book1(String url){
        super("Book", url, 5, 7);
    }

    @Override
    public int finalCost(int days){
        if (days <= getNumDays()){
            return getBaseCreditCost();
        }
        else {
            int extraDays = days - getNumDays();
            return getBaseCreditCost() + (extraDays * 1);
        }
    }
}
