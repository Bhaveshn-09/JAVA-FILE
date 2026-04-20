package Hashmap;

import java.util.*;

public class p1 {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Apple");
        hashMap.put(2, "Strawberry");
        hashMap.put(3, "Pear");
        hashMap.put(4, "Cucumber");
        hashMap.put(5, "Grapes");

        System.out.println("Iterating over entries:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}