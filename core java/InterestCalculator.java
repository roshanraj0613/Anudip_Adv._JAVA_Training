import java.util.Scanner;

// Compare this snippet from core%20java/InterestCalculator.java:
public class InterestCalculator {
    private final float principal;
    private final float rate;
    private final float time;
    public InterestCalculator(float principal, float rate, float time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public float calculateAmount() {
        // A = P(1 + rt/100)
        // A = amount
        // P = principal
        // r = rate of interest
        // t = time in years
        // A = P + P(rt/100)
        return principal + (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal:");
        float principal = scanner.nextFloat();
        System.out.println("Enter the rate of interest:");
        float rate = scanner.nextFloat();
        System.out.println("Enter the time (in years):");
        float time = scanner.nextFloat();

        InterestCalculator interestCalculator = new InterestCalculator (principal, rate, time);
        System.out.println("The amount to be paid is: " + interestCalculator.calculateAmount());
    }
}