package LinkedlListExample;
// Import the Stack class
import java.util.Stack;

public class StackManager {
    // Main method
    public static void main(String[] args) {
        // Declare a new Stack
        Stack<Integer> stack = new Stack<>();

        // Add 10 elements to the stack
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }

        // Remove 4 elements from the stack
        for (int i = 0; i < 4; i++) {
            stack.pop();
        }

        // Display the remaining elements in the stack
        System.out.println("Elements in stack: " + stack);
    }
}
