package Treemap;

import java.util.*;

public class p1 {
    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "Apple");
        treeMap.put(2, "Strawberry");
        treeMap.put(3, "Pear");
        treeMap.put(4, "Cucumber");
        treeMap.put(5, "Grapes");

        System.out.println("Iterating TreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}