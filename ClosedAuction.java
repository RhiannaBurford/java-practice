public class ClosedAuction extends Auction{

    @Override
    public Bid whoWins(List<Bid> bids){

        public ClosedAuction(int ID, Time startingTime, Date startingDate, String name,
    List<AuctionItem> auctionItems){
        super(ID, startingTime, startingDate, name, auctionItems);
    }

        double maxBid = 0;
        Bid toReturn;

        for (int i = 0; i < bids.size(); i++){
            Bid bid = bids.get(i);
            if (bid.getBidAmount() > maxBid){
                maxBid = bid.getBidAmount();
                toReturn = bid;
            }
        }

        return toReturn;
    }
}
