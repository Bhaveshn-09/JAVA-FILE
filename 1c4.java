package linkedlist;

import java.util.*;

public class p9 {
    public static void main(String[] args) {

        LinkedList<String> ls = new LinkedList<>();

        ls.add("Orange");
        ls.add("Green");
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        System.out.println("Elements with positions:");

        for (int i = 0; i < ls.size(); i++) {
            System.out.println("Index: " + i + " Value: " + ls.get(i));
        }
    }
}