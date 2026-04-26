public class MissingItemException extends Exception{

    // Default constructor
    public MissingItemException() {
        super("Auction item is missing.");
    }
    
    public MissingItemException(String message){
        super(message);
    }

}
