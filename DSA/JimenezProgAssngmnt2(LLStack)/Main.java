import java.util.*;
import java.io.*;

public class Main {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        LLStack stack = new LLStack();

        int decimal = (int) getDecimal();
        int base = getBase();

        decimalToBase(base, decimal, stack);
        displayStack(base, decimal, stack);
    }

    static double getDecimal(){
        double decimal;

        while(true){
            System.out.println("DECIMAL NUMBER: ");
            if(console.hasNextDouble()){
                decimal = Double.parseDouble(console.nextLine());
                break;
            }else{
                console.nextLine();
                System.out.println("Invalid Decimal Value.");
            }
        }

        return decimal;
    }

    static int getBase(){
        int base;
        while(true){
            System.out.println("BASE: ");
            if(console.hasNextInt()){
                base = Integer.parseInt(console.nextLine());
                if(base > 1 && base < 28)
                    break;
            }else{
                console.nextLine();
                System.out.println("Invalid Base. Must be between 2 and 27");
            }
        }
        return base;
    }

    static void decimalToBase(int base, int decimal, LLStack stack){
        if(base > 1 && base < 28){
            while(decimal != 0){
                int remainder = (int) decimal%base;
                String rmdrValue = getRmdrValue(Math.abs(remainder));

                stack.push(rmdrValue);
                decimal /= base;
            }
        }
    }

    static String getRmdrValue(int r){
        String letters = "ABCDEFGHIJKLMNOPQR";
        char[] lettersArr = letters.toCharArray();
        if(r > 9){
            return String.valueOf(lettersArr[r-10]);
        }else{
            return String.valueOf(r);
        }
    }

    static void displayStack(int base, int decimal, LLStack stack){
        System.out.printf("DECIMAL NUMBER CONVERTED TO BASE-%d:\n", base);
        if(decimal < 0){
            System.out.print("-");
            stack.popAll();
        }else{
            stack.popAll();
        }
    }
}