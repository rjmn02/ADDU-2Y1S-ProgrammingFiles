import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        System.out.print("Enter the base (between 2 and 27): ");
        int base = scanner.nextInt();

        if (base < 2 || base > 27) {
            System.out.println("Invalid base. Please enter a base between 2 and 27.");
            return;
        }

        String result = convertDecimalToBase(decimalNumber, base);
        System.out.println("Result: " + result);

        scanner.close();
    }

    private static String convertDecimalToBase(int decimalNumber, int base) {
        StringBuilder result = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % base;
            char digit = getDigit(remainder);
            result.insert(0, digit);
            decimalNumber /= base;
        }

        return result.toString();
    }

    private static char getDigit(int remainder) {
        if (remainder < 10) {
            return (char) ('0' + remainder);
        } else {
            return (char) ('A' + remainder - 10);
        }
    }
}