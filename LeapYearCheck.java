import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year conditions
        return (year % 4 == 0 && year % 100 != 0) || (year % 400==0);
    }
}
