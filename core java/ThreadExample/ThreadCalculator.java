package ThreadExample;

public class ThreadCalculator {
    // Main method
    public static void main(String[] args) {
        // Create an object of a class that implements Runnable
        Runnable r1 = new Runnable() {
            public void run() {
                int sum = 0;
                for (int i = 1; i <= 10; i++) {
                    sum += i;
                }
                double average = sum / 10.0;
                System.out.println("Average of first 10 numbers is: " + average);
            }
        };

        Runnable r2 = new Runnable() {
            public void run() {
                int[] arr = {1, 20, 50, 15, 30};
                for (int i : arr) {
                    System.out.println("Square of " + i + " is: " + (i * i));
                }
            }
        };

        // Create two threads and start them
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        try {
            t1.start();
            t1.join();
            // This will make sure t1 is completed before t2 starts
            t2.start();
            t2.join();
            // This will make sure t2 is completed before the main thread continues
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
