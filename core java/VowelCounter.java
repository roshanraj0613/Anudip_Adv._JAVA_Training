
public class VowelCounter {
    // Method to count the number of vowels in a sentence
    public void countVowels(String sentence) {
        int vowelCount = 0;
        // Convert the sentence to lowercase
        String lowerCaseSentence = sentence.toLowerCase();
        // Iterate through the sentence

        for (int i = 0; i < lowerCaseSentence.length(); i++) {
            // Check if the character is a vowel
            char ch = lowerCaseSentence.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                // Increment the vowel count
                vowelCount++;
            }
        }

        if (vowelCount > 0) {
            // Print the number of vowels
            System.out.println("Number of vowels: " + vowelCount);
            // Print the percentage of vowels
        } else {
            // If no vowels are found
            System.out.println("No vowels found.");
        }
    }
// Main function to test the VowelCounter class
    public static void main(String[] args) {
        // Create an object of VowelCounter
        VowelCounter vowelCounter = new VowelCounter();
        // Test the countVowels method
        String sentence = "This is a test sentence.";
        vowelCounter.countVowels(sentence);
    }
}