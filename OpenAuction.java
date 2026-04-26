import java.sql.Time;
import java.util.List;

public class OpenAuction extends Auction{

    public OpenAuction(int ID, Time startingTime, Date startingDate, String name,
    List<AuctionItem> auctionItems){
        super(ID, startingTime, startingDate, name, auctionItems);
    }

    @Override
    public Bid whoWins(List<Bid> bids){

        return bids.get(bids.size() -1);
    }
}
