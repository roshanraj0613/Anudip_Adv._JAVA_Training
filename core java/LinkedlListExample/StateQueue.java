package LinkedlListExample;

import java.util.LinkedList;
import java.util.Queue;

public class StateQueue {
    // Main method
    public static void main(String[] args) {
        // Create a queue
        Queue<String> states = new LinkedList<>();

        // Add 10 states to the queue
        states.add("California");
        states.add("Texas");
        states.add("New York");
        states.add("Florida");
        states.add("Illinois");
        states.add("Pennsylvania");
        states.add("Ohio");
        states.add("Georgia");
        states.add("North Carolina");
        states.add("Michigan");

        // Print the states
        while (!states.isEmpty()) {
            // Remove the first state from the queue
            System.out.println(states.remove());
        }
    }
}