package Trees;

import java.util.TreeSet;

public class CollFrame {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(40);
        tree.add(20);
        tree.add(10);
        tree.add(50);
        tree.add(30);
        System.out.println(tree);
        System.out.println(tree.first());
        System.out.println(tree.last());
        System.out.println(tree.higher(40));
        System.out.println(tree.lower(30));
        System.out.println(tree.floor(15));
        System.out.println(tree.ceiling(15));
        System.out.println(tree.descendingSet());
    }
}
