package LinkedHashMap;

import java.util.*;

public class p3 {
    public static void main(String[] args) {

        Map<String, Integer> programmingLanguages = new LinkedHashMap<>();

        programmingLanguages.put("Java", 1995);
        programmingLanguages.put("Python", 1991);
        programmingLanguages.put("JavaScript", 1995);
        programmingLanguages.put("C++", 1985);

        for (Map.Entry<String, Integer> entry : programmingLanguages.entrySet()) {
            System.out.println(entry.getKey() + " was developed in " + entry.getValue());
        }
    }
}