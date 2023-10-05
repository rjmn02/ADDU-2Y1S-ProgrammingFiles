/*Write a program to convert a number from decimal notation to a number expressed
in a number system whose base (or radix) is a number between 2 and 9. The conver-
sion is performed by repetitious division by the base to which a number is being
converted and then taking the remainders of division in the reverse order. 

For example, in converting to binary, number 6 requires three such divisions:
6/2 = 3 remainder 0, 
3/2 = 1 remainder 1, 
and finally, 1/2 = 0 remainder 1. 
The remainders 0, 1, and 1 are put in the reverse order so that the binary equivalent of 6 is equal to 110.

Modify your program so that it can perform a conversion in the case when the base
is a number between 11 and 27. Number systems with bases greater than 10 require
more symbols. Therefore, use capital letters. For example, a hexadecimal system
requires 16 digits: 0, 1, . . ., 9, A, B, C, D, E, F. In this system, decimal number 26 is
equal to 1A in hexadecimal notation, because 26/16 = 1 remainder 10 (that is, A),
and 1/16 = 0 remainder 1. */
import java.util.*;
import java.io.*;

public class Main {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        LLStack stack = new LLStack();

        double decimal = getDecimal();
        int base = getBase();

        if(base == -1){
            System.out.println("Invalid Base. Must be between 2 and 27");
        }
        else{
            decimalToBase(base, decimal, stack);
            System.out.printf("Decimal Number Converted to Base-%d:\n", base);
            System.out.println(stack.toString());
        }
    }
    
    static double getDecimal(){
        System.out.println("Decimal Number: ");
        double decimal = Double.parseDouble(console.nextLine());

        return decimal;
    }

    static int getBase(){
        System.out.println("Base: ");
        int base = Integer.parseInt(console.nextLine());

        if(base > 1 && base < 28)
            return base;
        else
            return -1;
    }

    static void decimalToBase(int base, double decimal, LLStack stack){
        if(base > 1 && base < 28){
            while((int)decimal != 0){
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
}