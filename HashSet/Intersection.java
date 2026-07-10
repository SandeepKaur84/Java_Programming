package HashSet;

import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4 };
        int arr2[] = { 3, 4, 5 };
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr1) {
            set.add(i);
        }
        for (int i : arr2) {
            if (set.contains(i)) {
                System.out.println(i);
            }
        }
    }
}
