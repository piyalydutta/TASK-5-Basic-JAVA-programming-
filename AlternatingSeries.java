import java.util.Scanner;

public class AlternatingSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Number of terms
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        
        int sum = 0;

        // Loop to calculate sum of series
        for (int i = 1; i <= n; i++) {
            // If i is odd, add it; if even, subtract it
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        
        // Output the result
        System.out.println("Sum of the series up to " + n + " terms is: " + sum);
        
        scanner.close();
    }
}
