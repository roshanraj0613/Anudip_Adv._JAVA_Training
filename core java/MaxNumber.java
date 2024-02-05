import java.util.Scanner;

public class MaxNumber {
    // declare the numbers
    private final int num1;
    private final int num2;

    public MaxNumber(int num1, int num2) {
        // initialize the numbers
        this.num1 = num1;
        this.num2 = num2;
    }

    public int findMax() {
        // return the maximum number
        return (num1 > num2) ? num1 : num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();

        MaxNumber maxNumber = new MaxNumber(number1, number2);
        int max = maxNumber.findMax();

        System.out.println("The maximum number is: " + max);
    }
}