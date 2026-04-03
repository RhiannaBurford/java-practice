public class SavingsAccountTest {
    public static void main(String[] args){
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        SavingsAccount.modifyInterestRate(0.04);
        System.out.println("Monthly interest for saver1 is "+ saver1.calculateMonthlyInterest());
        System.out.println("Monthly interest for saver2 is "+ saver2.calculateMonthlyInterest());
    }
}
