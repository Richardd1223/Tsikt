import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read base number
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();

        // Read exponent number
        System.out.print("Enter the exponent number: ");
        int exponent = scanner.nextInt();

        // Call the method to calculate the power
        int result = power(base, exponent);

        // Output the result
        System.out.println(base + "^" + exponent + " = " + result);
    }

    // Method to calculate the power of a number without using Math.pow()
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
}
