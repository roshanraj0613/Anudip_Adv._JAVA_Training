import java.util.Scanner;

public class PalindromeChecker {
    // Method to check if a string is a palindrome
    public boolean isPalindrome(String str) {
        // Convert the string to lowercase
        int start = 0;
        // Get the length of the string
        int end = str.length() - 1;

        while (start < end) {
            // Check if the characters at the start and end of the string are equal
            if (str.charAt(start) != str.charAt(end)) {
                // If not, the string is not a palindrome
                return false;
            }
            // Move the start and end pointers
            start++;
            // Move the end pointer
            end--;
        }
        // If all characters are equal, the string is a palindrome
        return true;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        // Read the string
        String str = scanner.nextLine();

        PalindromeChecker palindromeChecker = new PalindromeChecker();
        // Check if the string is a palindrome
        // Call the isPalindrome method
        // Pass the string as an argument
        // Store the result in a variable
        boolean isPalindrome = palindromeChecker.isPalindrome(str);

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}