package linkedlist;

import java.util.*;

public class p10 {
    public static void main(String[] args) {

        LinkedList<String> ls = new LinkedList<>();

        ls.add("Orange");
        ls.add("Green");
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        System.out.println("Before swapping:");
        System.out.println(ls);

        Collections.swap(ls, 0, 2);

        System.out.println("After swapping (1st & 3rd):");
        System.out.println(ls);
    }
}