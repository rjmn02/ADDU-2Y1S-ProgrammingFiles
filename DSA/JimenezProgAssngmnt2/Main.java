/*Write a program to convert a number from decimal notation to a number expressed
in a number system whose base (or radix) is a number between 2 and 9. The conver-
sion is performed by repetitious division by the base to which a number is being
converted and then taking the remainders of division in the reverse order. 

For example, in converting to binary, number 6 requires three such divisions: 
6/2 = 3 remainder 0 
3/2 = 1 remainder 1 
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
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        LLStack list = new LLStack();

        double value = Double.parseDouble(console.nextLine());
        int base = Integer.parseInt(console.nextLine());
    }

    static void decimalToBase(double x, int base){
        if(base >= 11 && base <= 27){
            decimalToBase(x%base, base);
        }
    }
}
