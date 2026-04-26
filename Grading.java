public interface Grading {

    public 

    // And in the Art class definition you do 
    // public class Art extends AuctionItem implements Grading

    // You must provide an implementation for the interface method
    @Override
    public void gradeItem() {
        // Logic to grade the art piece
        System.out.println("Art piece has been evaluated.");
    }

}
