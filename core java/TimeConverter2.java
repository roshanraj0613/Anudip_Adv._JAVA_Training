import java.util.Scanner;

public class TimeConverter2 {
    // hours, minutes, seconds are instance variables
    // they are initialized to 0 by default
    // they are private so that they can't be accessed from outside the class
    // they are final so that they can't be modified
    // they are initialized in the constructor
    private int hours;
    private int minutes;
    private int seconds;


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

    public void display() {
        System.out.println(hours + " hour " + minutes + " minute " + seconds + " second");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time in seconds:");
        int totalSeconds = scanner.nextInt();

        TimeConverter2 timeConverter2 = new TimeConverter2(totalSeconds);
        timeConverter2.display();
    }
}