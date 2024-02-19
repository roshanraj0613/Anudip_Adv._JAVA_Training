import java.util.Scanner;

public class ArrayMaxFinder {
    // Method to find the maximum element in the array
    public int findMax(int[] array) {
        // Assume the first element is the maximum
        int max = array[0];
        for (int num : array) {
            // If the current element is greater than the maximum
            if (num > max) {
                // Update the maximum
                max = num;
            }
        }
        // Return the maximum
        return max;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        // Read the size of the array
        int size = scanner.nextInt();
        // Create an array of the specified size
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        ArrayMaxFinder arrayMaxFinder = new ArrayMaxFinder();
        // Find the maximum element in the array
        int max = arrayMaxFinder.findMax(array);

        System.out.println("The maximum element in the array is: " + max);
    }
}