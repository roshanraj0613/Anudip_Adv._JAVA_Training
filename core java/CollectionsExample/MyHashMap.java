package CollectionsExample;

import java.util.HashMap;

public class MyHashMap {
    // The map is private and can only be accessed within the class
    private final HashMap<String, String> map;

    public MyHashMap() {
        // The map is initialized in the constructor
        this.map = new HashMap<>();
    }

    public void put(String key, String value) throws Exception {
        // The put method is used to add a key-value pair to the map
        if (key == null || value == null) {
            // An exception is thrown if the key or value is null
            throw new Exception("Key or Value cannot be null");
        }
        this.map.put(key, value);
    }

    public boolean isEmpty() {
        // The isEmpty method is used to check if the map is empty
        return this.map.isEmpty();
    }
}

// Main class
class MainFunction {
    public static void main(String[] args) {
        // An instance of the MyHashMap class is created
        MyHashMap myMap = new MyHashMap();

        try {
            // A key-value pair is added to the map
            myMap.put("Key1", "Value1");
            // The isEmpty method is used to check if the map is empty
            System.out.println("Key-value pair added successfully.");
        } catch (Exception e) {
            // An error message is printed if an exception occurs
            System.out.println("An error occurred: " + e.getMessage());
        }

        System.out.println("Is the HashMap empty? " + myMap.isEmpty());
    }
}