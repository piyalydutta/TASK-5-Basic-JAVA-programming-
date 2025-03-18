import java.util.Scanner;

public class OddSquareSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for number of terms
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        
        int sum = 0;
        int oddNumber = 1;

        for (int i = 0; i < n; i++) {
            sum += oddNumber * oddNumber; // Adding square of odd number
            oddNumber += 2; // Moving to the next odd number
        }

        System.out.println("Sum of the series: " + sum);
        scanner.close();
    }
}