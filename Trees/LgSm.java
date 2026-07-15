package Trees;

import java.util.TreeSet;

public class LgSm {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(10);
        tree.add(20);
        tree.add(5);
        tree.add(60);
        tree.add(25);
        System.out.println(tree.first());
        System.out.println(tree.last());
    }
}
