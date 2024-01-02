import java.util.Scanner;

public class Factorial {
    private final int num;

    public Factorial(int num) {
        this.num = num;
    }

    public long calculateFactorial() {
        if(num <0 ){
            System.out.println("Factorial is not Possible");
        }
        else if (num == 0){
            System.out.println("Factorial = 1");
        }

        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
            }
        return factorial;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();

        Factorial factorial = new Factorial(num);
        System.out.println("The factorial of " + num + " is " + factorial.calculateFactorial());
    }
}