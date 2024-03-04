//import java.util.TreeMap;
//
//public class Tree {
//    public static void main(String[] args) {
//        // Creating a TreeMap
//        TreeMap<Integer, String> treeMap = new TreeMap<>();
//
//        // Adding elements to the TreeMap
//        for (int i = 1; i <= 10; i++) {
//            treeMap.put(i, "Value" + i);
//        }
//
//        // Printing the TreeMap
//        treeMap.forEach((key, value) -> System.out.println("Key = " + key + ", Value = " + value));
//    }
//}

import java.util.TreeMap;

public class Tree {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding elements to the TreeMap
        for (int i = 1; i <= 10; i++) {
            treeMap.put(i, "Value" + i);
        }

        // Printing the TreeMap
        treeMap.forEach((key, value) -> System.out.println("Key = " + key + ", Value = " + value));

        // Getting the first (lowest) key
        int firstKey = treeMap.firstKey();
        System.out.println("First key = " + firstKey + ", Value = " + treeMap.get(firstKey));

        // Getting the last (highest) key
        int lastKey = treeMap.lastKey();
        System.out.println("Last key = " + lastKey + ", Value = " + treeMap.get(lastKey));
    }
}