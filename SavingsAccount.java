public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance){
        annualInterestRate = 0.0;
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest(){
        double intRate = (this.savingsBalance * (annualInterestRate/12.0));
        this.savingsBalance = this.savingsBalance + intRate;
        return intRate;
    }

    public static void modifyInterestRate(double newRate){
        annualInterestRate = newRate;
    }
    public void setSavingsBalance(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
    public double getSavingsBalance(){
        return this.savingsBalance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
}
