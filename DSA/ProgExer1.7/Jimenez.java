import java.util.Scanner;
import java.util.Stack;

public class Jimenez {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        while(true){
            int decimal = getDecimal();
            if(decimal < 0){
                System.out.println("thank you for using the program. bye!");
                break;
            }
            int base = getBase();

            System.out.printf("value of %d in base %d is ", decimal, base);
            decimalToBase(decimal, base, stack);
            while(!stack.isEmpty()) {
                System.out.print(stack.pop());
            }
            System.out.println("");
        }
    
    }

    static int getDecimal(){
        int decimal;
        while(true){
            System.out.print("decimal value: ");
            if(console.hasNextInt()){
                decimal = Integer.parseInt(console.nextLine());
                break;
            }else{
                console.nextLine();
                System.out.println("invalid decimal value.");
            }
        }

        return decimal;
    }

    static int getBase(){
        int b;

        while(true){
            System.out.print("target base: ");
            if(console.hasNextInt()){
                b = Integer.parseInt(console.nextLine());
                if(b > 1 && b < 17){
                    break;
                } else{
                    System.out.println("invalid base. must be 2 to 16.");
                }
            } else{
                console.nextLine();
                System.out.println("invalid base. must be 2 to 16.");
            }
        }

        return b;
        
    }
    static int decimalToBase(int d, int b, Stack<String> stack){
        if(d == 0){
            return 0;
        }
        int remainder = Math.abs(d%b);
        String remainderVal = getVal(remainder);
        stack.push(remainderVal);
        return decimalToBase(d/b, b, stack);
    }

    static String getVal(int r){
        String valuesBase1016 = "ABCDEF";
        char[] valChArr = valuesBase1016.toCharArray();
        if(r > 9){
            return String.valueOf(valChArr[r-10]);
        }else{
            return String.valueOf(r);
        }
    }
}
