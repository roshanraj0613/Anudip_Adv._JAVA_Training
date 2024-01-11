import java.util.Scanner;

public class Division {
    double num1;
    double num2;

    // constructor

    Division(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    double performDivision() {
        // check if num2 is not equal to zero
        // if num2 is not equal to zero, then perform division
        // else print error message

        if (num2 != 0)
        {
            return num1 / num2;
        } else {
            System.out.println("Error! Dividing by zero is not allowed.");
            return Double.NaN;
        }
    }
}

// inheritance
class DivisionCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();
        Division division = new Division(num1, num2);
        double result = division.performDivision();
        if (!Double.isNaN(result)) {
            System.out.println("The result is: " + result);
        }
    }
}