package LinkedlListExample;

import java.util.HashSet;

public class HashSetManager {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hSet = new HashSet<>();

        // Add elements to the HashSet
        hSet.add("Element1");
        hSet.add("Element2");
        hSet.add("Element3");

        // Print the HashSet
        System.out.println("HashSet before adding new element: " + hSet);

        // Add a new element to the HashSet
        hSet.add("Element4");

        // Print the HashSet after adding new element
        System.out.println("HashSet after adding new element: " + hSet);
    }
}