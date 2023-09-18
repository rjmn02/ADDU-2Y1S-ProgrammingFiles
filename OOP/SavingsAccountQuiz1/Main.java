import java.util.*;
import java.io.*;

public class Main {
    
    static int accountNumber;
    static String customerName;
    static String phoneNumber;
    
    //savingsBalance
    static double startingBalance;
    static double depositAmount;
    
    static double annualInterestRate;
    static double withdrawAmount;
    
    static Scanner in = new Scanner(System.in);
    static SavingsAccount account0 = new SavingsAccount();
    
    public static void main(String[] args){
        inputValues();
        settingValues();
        callMethods();
    }
    
    static void inputValues(){
        
        accountNumber = Integer.parseInt(in.nextLine());
        customerName = in.nextLine();
        phoneNumber = in.nextLine();
        startingBalance = Double.parseDouble(in.nextLine());
        depositAmount = Double.parseDouble(in.nextLine());
        annualInterestRate = Double.parseDouble(in.nextLine());
        withdrawAmount = Double.parseDouble(in.nextLine());
        
    }
    
    static void settingValues(){
        SavingsAccount.modifyInterestRate(annualInterestRate);
        account0.setAccountNumber(accountNumber);
        account0.setCustomerName(customerName);
        account0.setPhoneNumber(phoneNumber);
    }
    
    static void callMethods(){
        account0.deposit(startingBalance, depositAmount);
        account0.withdraw(withdrawAmount);
        account0.calculateMonthlyInterest();
    }
}