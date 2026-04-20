package LinkedHashMap;

import java.util.*;

public class p1 {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>() {
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > 4; // keep only 4 elements
            }
        };

        map.put(1, "Apple");
        map.put(2, "Strawberry");
        map.put(3, "Pear");
        map.put(4, "Cucumber");
        map.put(5, "Grapes");

        System.out.println("After inserting 5 elements (only 4 kept):");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}