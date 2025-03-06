package org.example.solutions;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapExampleSolutionTest {

    private MapExampleSolution mapExampleSolution;
    @Test
    void testMapWithFiveElements() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put("Kiwi", 40);
        map.put("Pineapple", 50);


        MapExampleSolution mapExampleSolution = new MapExampleSolution();

        assertEquals("Apple", map.get("Apple"));

        // aha ...


        assertEquals(map.size(), mapExampleSolution.;)
        // This is complete bullshit.

        // If the intellisense was a little bit smarter it should have been able to read the code that I have over here and
        // conclude that
        assertEquals("Banana", map.get("Banana"));
    }


    @Test
    void countMappings() {
        MapExampleSolution mapExampleSolution = new MapExampleSolution();


    }


}