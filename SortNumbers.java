import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        // Creating an array to store numbers
        int[] numbers = new int[n];

        // Taking input for elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sorting the array in ascending order
        Arrays.sort(numbers);

        // Displaying the sorted numbers
        System.out.println("Sorted numbers in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Closing the scanner
        scanner.close();
    }
}
    