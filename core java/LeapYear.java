import java.util.Scanner;

public class LeapYear {
    private final int year;

    public LeapYear(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        // check if the year is a leap year
        if (year % 400 == 0) {
            // if the year is divisible by 400, it is a leap year
            return true;
        }
        else if (year % 100 == 0)
        {
            // if the year is divisible by 100, it is not a leap year
            return false;
        } else
        {
            // if the year is divisible by 4, it is a leap year
            return year % 4 == 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scanner.nextInt();

        LeapYear leapYear = new LeapYear(year);
        boolean isLeap = leapYear.isLeapYear();

        System.out.println(year + " is " + (isLeap ? "a Leap Year" : "not a Leap Year"));
    }
}