import java.util.*;
import java.io.*;

public class Main{
    static Scanner in = new Scanner(System.in);
    
    static String partNum;
    static String partDesc;
    static int quantity;
    static double pricePerItem;
    
    public static void main(String[] args) throws Exception{
        
        getInputData();
        output();
    }
    static void output(){
        
        Invoice invoice0 = new Invoice(partNum, partDesc, quantity, pricePerItem);
        System.out.printf("Invoice amount is: %.2f", invoice0.getInvoiceAmount());
        
    }

    //getInputData
    static void getInputData(){
        
        System.out.println("Part Number: ");
        partNum = in.nextLine();
        
        System.out.println("Part Description: ");
        partDesc = in.nextLine();
        
        System.out.println("Quantity: ");
        quantity = in.nextInt();
        in.nextLine();
        
        quantity = setZeroQuantity(quantity);
        
        System.out.println("Price per Item: ");
        pricePerItem = in.nextDouble();
        in.nextLine();
        
        pricePerItem = setZeroPricePerItem(pricePerItem);
        
        
    }
    
    //set quantity to 0
    static int setZeroQuantity(int quantity){
        
        if(quantity < 0){
            return 0;
        }else{
            return quantity;
        }
        
    }
    
    //set priceperitem to 0.0
    static double setZeroPricePerItem(double pricePerItem){
        
        if(pricePerItem < 0){
            return 0.0;
        }else{
            return pricePerItem;
        }
    }
}