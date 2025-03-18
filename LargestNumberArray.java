public class LargestNumberArray {
    
        public static void main(String[] args) {
            int[] numbers = {10, 25, 78, 45, 90, 100, 67}; // Sample array
    
            int max = numbers[0]; // Assume first element is the largest
    
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i]; // Update max if a larger number is found
                }
            }
    
            System.out.println("The largest number in the array is: " + max);
        }
    }