import java.util.Scanner;
public class BanglaSeasonFind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input month from user
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        // Using switch-case
        String seasonSwitch = getSeasonUsingSwitch(month);
        System.out.println("Bangla season : " + seasonSwitch);

        scanner.close();
    }

    // Method using switch-case
    public static String getSeasonUsingSwitch(int month) {
        switch (month) {
            case 5: case 6:
                return "Grishmo (Summer)";
            case 7: case 8:
                return "Barsha (Rainy)";
            case 9: case 10:
                return "Shorot (Autumn)";
            case 11: case 12:
                return "Hemonto (Late Autumn)";
            case 1: case 2:
                return "Sheet (Winter)";
            case 3: case 4:
                return "Bashanta (Spring)";
            default:
                return "Invalid month!";
        }
    }
}