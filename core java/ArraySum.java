import java.util.Scanner;

public class ArraySum {
    public int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            // Add each element of the array to the sum
            sum += num;
        }
        // Return the sum
        return sum;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        // Read the size of the array
        int size = scanner.nextInt();

        int[] array = new int[size];
        // Read the elements of the array

        System.out.println("Enter the elements of the array:");
        // Read the elements of the array
        for (int i = 0; i < size; i++) {
            // Read the elements of the array
            array[i] = scanner.nextInt();
        }

        ArraySum arraySum = new ArraySum();
        // Calculate the sum of the array elements
        // Call the calculateSum method
        // Pass the array as an argument
        int sum = arraySum.calculateSum(array);

        System.out.println("The sum of the array elements is: " + sum);
    }
}