import java.sql.Time;
import java.util.Date;
import java.util.List;


public abstract class Auction {

    private int ID;
    private Time startingTime;
    private Date startingDate;
    private String name;
    private List<AuctionItem> auctionItems; 

    public Auction(int ID, Time startingTime, Date startingDate, String name,
    List<AuctionItem> auctionItems){
        this.ID = ID;
        this.startingTime = startingTime;
        this.startingDate = startingDate;
        this.name = name;
        this.auctionItems = auctionItems;
        }

    // getters and setters

    public void setStartingTime(Time startingTime){
        this.startingTime = startingTime;
    }
    public void setStartingDate(Date startingDate){
        this.startingDate = startingDate;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAuctionItems(List<AuctionItem> auctionItems){
        this.auctionItems = auctionItems;
    }

    public abstract Bid whoWins(List<Bid> bids);

    public AuctionItem nextAuctionItem(){

        // then i have an attribute that is initialised to 0 
        if (count < auctionItems.size()){
            AuctionItem next = auctionItems.get(count);
            count++;
            return next;
        }
        return null;
        
    }
}
