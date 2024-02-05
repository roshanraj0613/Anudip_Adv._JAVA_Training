import java.util.Scanner;
public class StrongNumber {
    private final int num;

    public StrongNumber(int num) {
        this.num = num;
    }
    private int factorial(int n) {
        // calculate the factorial of a number
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            // multiply the number with the previous result
            fact *= i;
        }
        return fact;
    }

    public boolean isStrongNumber() {
        // store the number in a temporary variable
        int temp = num;
        int sum = 0;

        while (temp != 0) {
            // get the last digit
            int digit = temp % 10;
            // calculate the factorial of the digit and add it to the sum
            sum += factorial(digit);
            // remove the last digit
            temp /= 10;
            // repeat the process until the number becomes 0
        }
        // check if the sum is equal to the number
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        StrongNumber strongNumber = new StrongNumber(number);
        boolean isStrong = strongNumber.isStrongNumber();

        System.out.println(number + " is " + (isStrong ? "a Strong Number" : "not a Strong Number"));
    }
}