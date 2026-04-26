import java.sql.Time;
import java.util.List;

public class RandomDiscardAuction extends ClosedAuction{
    

    public RandomDiscardAuction(int ID, Time startingTime, Date startingDate, String name,
    List<AuctionItem> auctionItems){
        super(ID, startingTime, startingDate, name, auctionItems);
    }

    public Bid whoWins(List<Bid> bids){

        int max = bids.size() - 1;
        int min = 0;
        // Delete 1/5 of bidders
        for (int i = 0; i < bids.size() / 5; i++){
            // Choose a random number to discard    
            int randomInt = (int)(Math.random() * bids.size()) + min;    
            Bid bid = bids.get(randomInt);
            if (bid == null){
                i = i - 1;
                continue;
            }
            bids.remove(bid);
        }

        // Logic from previous question
    }
}
