import java.util.*;
import java.io.*;

public class Jimenez_Converter {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        Stack<Object> stack = new Stack<>();
        int decimal = getDecimal();
        int base = getBase();

        decimalToBase(base, decimal, stack);
        displayStack(base, decimal, stack);
    }

    static int getDecimal(){
        int decimal;

        while(true){
            System.out.println("DECIMAL NUMBER: ");
            if(console.hasNextInt()){
                decimal = Integer.parseInt(console.nextLine());
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
                if(base > 1 && base < 10)
                    break;
            }else{
                console.nextLine();
                System.out.println("Invalid Base. Must be between 2 and 9.");
            }
        }
        return base;
    }

    static void decimalToBase(int base, int decimal, Stack<Object> stack){
        if(base > 1 && base < 10){
            while(decimal != 0){
                int remainder = (int) decimal%base;
                stack.push(remainder);
                decimal /= base;
            }
        }
    }

    static void displayStack(int base, int decimal, Stack<Object> stack){
        System.out.printf("DECIMAL NUMBER CONVERTED TO BASE-%d:\n", base);
        if(decimal < 0){
            System.out.print("-");
            while(!(stack.isEmpty()))
                System.out.print(stack.pop());
        }else{
            while(!(stack.isEmpty()))
                System.out.print(stack.pop());
        }
    }
}