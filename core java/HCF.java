import java.util.Scanner;

public class HCF {
    private int num1;
    private int num2;

    public HCF(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int calculateHCF() {
        int hcf = 1;
        for (int i = Math.min(num1, num2); i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
                break;
            }
        }
        return hcf;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        HCF hcf = new HCF(num1, num2);
        System.out.println("The HCF is: " + hcf.calculateHCF());
    }
}