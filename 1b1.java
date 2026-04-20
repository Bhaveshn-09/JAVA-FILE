package linkedlist;

import java.util.*;

public class p6 {
    public static void main(String[] args) {

        LinkedList<String> ls = new LinkedList<>();

        ls.add("Orange");
        ls.add("Green");
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        // Start from 2nd element (index 1)
        Iterator<String> iterator = ls.listIterator(1);

        System.out.println("Iterating from 2nd element:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}