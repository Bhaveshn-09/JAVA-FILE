package LinkedHashMap;

import java.util.*;

public class p4 {
    public static void main(String[] args) {

        String[] keys = {"C", "A", "B", "E", "D"};
        Integer[] values = {3, 1, 2, 5, 4};

        Map<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }

        System.out.println(map);
    }
}