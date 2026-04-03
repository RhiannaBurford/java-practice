public class InvoiceTest {
    public static void main(String[] args){
        Invoice inv = new Invoice("A12", "Hammer", 5, 9.99);

        System.out.println(inv.getPartNum());
        System.out.println(inv.getPartDes());
        System.out.println(inv.getQuantity());
        System.out.println(inv.getPrice());
        System.out.println(inv.getInvoiceAmount());
    }
}
