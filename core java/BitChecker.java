import java.util.Scanner;

public class BitChecker {
    // declare the number and the bit position
    private final int num;
    private final int n;

    public BitChecker(int num, int n) {
        // initialize the number and the bit position
        this.num = num;
        this.n = n;
    }

    public boolean isNthBitSet() {
        // check if the nth bit is set
        return ((num & (1 << n)) != 0);
    }

    public static void main(String[] args) {
        // create a scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        // read the number
        int number = scanner.nextInt();
        System.out.println("Enter the bit position to check:");
        // read the bit position
        int bitPosition = scanner.nextInt();
        // create a BitChecker object

        BitChecker bitChecker = new BitChecker(number, bitPosition);
        // check if the nth bit is set
        boolean isSet = bitChecker.isNthBitSet();
        // print the result

        System.out.println("The " + bitPosition + "th bit is " + (isSet ? "set" : "not set"));
    }
}