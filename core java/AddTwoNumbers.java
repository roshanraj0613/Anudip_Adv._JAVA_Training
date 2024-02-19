import java.util.Scanner;

public class AddTwoNumbers {
    // Main method
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        // Read the first number
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        // Read the second number
        int num2 = scanner.nextInt();
        // Calculate the sum of the two numbers

        int sum = num1 + num2;

        System.out.println("The sum of the two numbers is: " + sum);
    }
}