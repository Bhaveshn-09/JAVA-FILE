package arraylist;

import java.util.*;

public class p3 {
    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();

        ls.add("Orange");
        ls.add("Green");
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        System.out.println("Before sorting:");
        System.out.println(ls);

        Collections.sort(ls);

        System.out.println("After sorting:");
        System.out.println(ls);
    }
}