package Hashmap;

import java.util.*;

public class p2 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

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

        System.out.println("Size after adding again: " + map.size());
    }
}