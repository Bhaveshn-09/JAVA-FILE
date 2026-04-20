package Hashmap;

import java.util.*;

public class p4 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

        System.out.println("Is map empty before clear? " + map.isEmpty());

        map.clear();

        System.out.println("Is map empty after clear? " + map.isEmpty());
    }
}