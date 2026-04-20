package arraylist;

import java.util.*;

public class p4 {
    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();

        ls.add("Orange");
        ls.add("Green");
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        System.out.println("Original List:");
        System.out.println(ls);

        System.out.println("First and Second elements using subList:");
        System.out.println(ls.subList(0, 2));
    }
}