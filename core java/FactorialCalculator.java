import java.util.Scanner;

public class FactorialCalculator {
    public long calculateFactorial(int num) {
        // Initialize the factorial variable to 1
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            // Multiply the factorial by the current number
            factorial *= i;
        }
        return factorial;
        // Return the factorial
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        // Read the number
        int num = scanner.nextInt();

        FactorialCalculator factorialCalculator = new FactorialCalculator();
        // Calculate the factorial of the number
        long factorial = factorialCalculator.calculateFactorial(num);
        // Call the calculateFactorial method

        System.out.println("The factorial of the number is: " + factorial);
    }
}