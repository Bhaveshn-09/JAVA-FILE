package linkedlist;

import java.util.*;

public class p7 {
    public static void main(String[] args) {

        LinkedList<String> ls = new LinkedList<>();

        ls.add("Orange");
        ls.add("Green");
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        Iterator<String> iterator = ls.descendingIterator();

        System.out.println("Reverse order:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}