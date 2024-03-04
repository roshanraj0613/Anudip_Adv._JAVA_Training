package TreeMapExample;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NameAgeSearch {
    // Main method
    public static void main(String[] args) {
        // Creating a TreeMap with name-age pairs
        Map<String, Integer> nameAgeMap = new TreeMap<>();

        // Adding some name-age pairs to the TreeMap
        nameAgeMap.put("Roshan", 25);
        nameAgeMap.put("Anuj", 30);
        nameAgeMap.put("Vivek", 35);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an age to search for: ");
        // Reading the age from the user
        int age = scanner.nextInt();

        // Searching for the age in the TreeMap
        boolean found = false;
        // Iterating over the name-age pairs
        for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
            // If the age is found
            if (entry.getValue().equals(age)) {
                // Print the name and age
                System.out.println(entry.getKey() + " is " + age + " years old.");
                found = true;
            }
        }

        if (!found) {
            // If the age is not found
            System.out.println("No name found with the age " + age + ".");
        }
        // Closing the scanner

        scanner.close();
    }
}