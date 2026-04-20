package arraylist;

import java.util.*;

public class p5 {
    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();

        ls.add("Orange");
        ls.add("Green");
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        System.out.println("Original List:");
        System.out.println(ls);

        int n = 3; // delete 3rd element

        // index = n-1
        ls.remove(n - 1);

        System.out.println("After removing " + n + "th element:");
        System.out.println(ls);
    }
}