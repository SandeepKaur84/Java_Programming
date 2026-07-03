package LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Example2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(50);
        list.add(7);
        list.add(30);
        list.add(13);
        list.add(10);
        System.out.print(list);

        System.out.println();

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("apple");
        list2.add("mango");
        list2.add("banana");

        if (list2.contains("mango")) {
            System.out.println("Element exist");
        } else {
            System.out.println("Not exist in the array");
        }

        Collections.reverse(list2);
        System.out.println(list2);

        Iterator<Integer> it = list.iterator();
        // while (it.hasNext()) {
        // System.out.print(it.next() + " ");
        // }

        while (it.hasNext()) {
            if (it.next() % 2 != 0) {
                it.remove();
            }
        }
        System.out.println(list);

    }
}
