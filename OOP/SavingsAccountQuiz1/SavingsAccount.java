public class SavingsAccount {
    
    private int accountNumber;
    private String customerName;
    private String phoneNumber;
    private double savingsBalance;
    private static double annualInterestRate;

    
    //getters
    public int getAccountNumber(){ return this.accountNumber; }
    public String getCustomerName(){ return this.customerName; }
    public String getPhoneNumber(){ return this.phoneNumber; }
    public double getSavingsBalance(){ return this.savingsBalance; }
    public static double getAnnualInterestRate(){ return annualInterestRate; }
    
    
    //setters
    public void setAccountNumber(int accountNumber){ this.accountNumber = accountNumber; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    
    public static void modifyInterestRate(double interestRate){ annualInterestRate = interestRate; }
    
    public void deposit(double startingBalance, double depositAmount){
        this.savingsBalance = (startingBalance + depositAmount);
        System.out.printf("Deposited %.2f new balance is %.2f \n", depositAmount, this.savingsBalance);
    }
    
    public void withdraw(double withdrawAmount){
        if(withdrawAmount > savingsBalance) {
            System.out.printf("Insufficient funds, available balance is: %.2f \n", this.savingsBalance);
        }else {
            this.savingsBalance -= withdrawAmount;
            System.out.printf("Withdrawed %.2f new balance is %.2f \n", withdrawAmount, this.savingsBalance);
        }
    }
    
    public void calculateMonthlyInterest(){
        double monthlyInterest = (this.savingsBalance * annualInterestRate)/12;
        System.out.printf("New balance after interest rate is applied %.2f \n", this.savingsBalance + monthlyInterest);

    }
    
}

