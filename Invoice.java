public class Invoice {
    // Attributes
    private String partNum;
    private String partDes;
    private int quantity;
    private double price;

    // Constructor
    public Invoice(String partNum, String partDes, int quantity, double price){
        this.partNum = partNum;
        this.partDes = partDes;
        this.quantity = (quantity > 0) ? quantity : 0;
        this.price = (price > 0) ? price : 0.0;
    }

    // Setters
    public void setPartNum(String partNum){
        this.partNum = partNum;
    }
    public void setPartDes(String partDes){
        this.partDes = partDes;
    }
    public void setQuantity(int quantity){
        this.quantity = (quantity > 0) ? quantity : 0;
    }
    public void setPrice(double price){
        this.price = (price > 0) ? price : 0.0;
    }
    
    // Getters
    public String getPartNum(){
        return this.partNum;
    }
    public String getPartDes(){
        return this.partDes;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public double getPrice(){
        return this.price;
    }

    // Specialised methods
    public double getInvoiceAmount(){
        return quantity * price;
    }
}
