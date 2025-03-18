import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get base from user
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        // Get exponent from user
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        // Calculate power using a loop
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base; // Multiply base exponent times
        }

        // Display result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        // Close scanner
        scanner.close();
    }
}