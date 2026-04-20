package linkedlist;

import java.util.*;

public class p8 {
    public static void main(String[] args) {

        LinkedList<String> ls = new LinkedList<>();

        ls.add("Orange");
        ls.add("Green");
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        System.out.println("Before inserting:");
        System.out.println(ls);

        ls.offerLast("Pink");

        System.out.println("After inserting at end:");
        System.out.println(ls);
    }
}