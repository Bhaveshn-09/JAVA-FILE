package arraylist;

import java.util.*;

public class p1 {
    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();

        ls.add("Orange");
        ls.add("Green");
        ls.add("Pink");
        ls.add("Red");

        System.out.println("Colors: " + ls);

        if (ls.contains("Red")) {
            System.out.println("Red is available");
        } else {
            System.out.println("Red is not available");
        }
    }
}