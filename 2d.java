package Treemap;

import java.util.*;

public class p3 {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1, "Banana");
        map.put(2, "Orange");
        map.put(3, "Guava");
        map.put(4, "Pomegranate");
        map.put(5, "Amla");

        map.clear();
        System.out.println("Size after clear: " + map.size());

        // Adding again
        map.put(1, "Banana");
        map.put(2, "Orange");
        map.put(3, "Guava");
        map.put(4, "Pomegranate");
        map.put(5, "Amla");

        System.out.println("Size after adding: " + map.size());

        System.out.println("Iterating elements:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}