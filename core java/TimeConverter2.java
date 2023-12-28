//Write a program in java using if statement  and also use class and object to input time in second. Convert It to equivalent hour, minute and second.
//And also use display another method.
//
//e.g Input : 3725
//Output : 1 hour 2 minute 5 second


import java.util.Scanner;

// TimeConverter2 is a class
public class TimeConverter2 {
    // hours, minutes, seconds are instance variables
    // they are private, so they can only be accessed by methods in this class
    // they are initialized to 0
    // if you don't initialize them, they will be initialized to 0 by default
    private int hours;
    // private int hours = 0; // this is also valid
    private int minutes;
    // private int minutes = 0; // this is also valid
    private final int seconds;
    // private final int seconds = 0; // this is also valid


    // constructor
    public TimeConverter2(int totalSeconds) {
        if (totalSeconds >= 3600) {
            hours = totalSeconds / 3600;
            totalSeconds %= 3600;
        }
        if (totalSeconds >= 60) {
            minutes = totalSeconds / 60;
            totalSeconds %= 60;
        }

        seconds = totalSeconds;
    }
    // display is a public method
    public void display() {
        System.out.println(hours + " hour " + minutes + " minute " + seconds + " second");
    }

    // main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time in seconds:");
        int totalSeconds = scanner.nextInt();

        TimeConverter2 timeConverter2 = new TimeConverter2(totalSeconds);
        timeConverter2.display();
    }
}