package org.example.solutions;

import java.util.HashMap;
import java.util.Map;

public class MapExampleSolution {

    public static <K, V> int countMappings(Map<K, V> map) {
        return map.size(); // Returns the number of key-value mappings
    }

    public static void main(String[] args) {
        // Create a map and add some key-value pairs
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put("Kiwi", 40);
        map.put("Pineapple", 50);

        // Count the number of key-value mappings
        int size = countMappings(map);

        // Display the result
        System.out.println("The result of the mapping should be 5: ");
        System.out.println("The actual size of the map is: " + size);
    }



}
