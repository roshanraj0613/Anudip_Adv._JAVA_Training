import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time in seconds:");
        int totalSeconds = scanner.nextInt();

        int hours = 0, minutes = 0, seconds = 0;

        if (totalSeconds >= 3600) {
            hours = totalSeconds / 3600;
            totalSeconds = totalSeconds % 3600;
        }

        if (totalSeconds >= 60) {
            minutes = totalSeconds / 60;
            totalSeconds = totalSeconds % 60;
        }

        seconds = totalSeconds;
        System.out.println(hours + " hour " + minutes + " minute " + seconds + " second");
    }
}