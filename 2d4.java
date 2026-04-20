package Treemap;

import java.util.*;

public class p4 {
    public static void main(String[] args) {

        TreeMap<String, String> map = new TreeMap<>();

        map.put("C2", "Red");
        map.put("C1", "Green");
        map.put("C4", "Black");
        map.put("C3", "White");

        System.out.println("TreeMap: " + map);
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());
    }
}