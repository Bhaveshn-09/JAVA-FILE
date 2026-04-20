package arraylist;

import java.util.*;

public class p2 {
    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();

        ls.add("Orange");
        ls.add("Green");
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        System.out.println("Original List: " + ls);

        // Remove 2nd element (index 1)
        ls.remove(1);
        System.out.println("After removing 2nd element: " + ls);

        // Remove "Blue" (by object)
        ls.remove("Blue");
        System.out.println("After removing Blue: " + ls);
    }
}