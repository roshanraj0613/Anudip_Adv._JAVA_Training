import java.util.Scanner;

public class Prime {
    private final int num;

    public Prime(int num) {
        this.num = num;
    }

    public boolean isPrime() {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();

        Prime prime = new Prime(num);
        if (prime.isPrime()) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}