package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDupli {

    //O(n) + O(1) -> TC + SC
    public static int removeDuplicates(int arr[]) {
        if (arr.length == 0) {
            return 0;
        }
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index]) {
                index++;
                arr[index] = arr[i];
            }
        }
        return index + 1;
    }

    //O(n^2) + O(n) -> TC + SC
    public static void removeDupUsingArrayList() {
        int[] arr = { 5, 7, 8, 9, 6, 4, 7, 5, 7, 4, 2, 3, 6, 9, 8, 7, 4, 5, 6 };
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!result.contains(arr[i])) {
                result.add(arr[i]);
            }
        }
        System.out.println("Array after removing duplicates:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    //O(n) + O(n) -> TC + SC
    public static void removeDupUsingHashSet() {
        int[] arr2 = { 5, 7, 8, 9, 6, 4, 7, 5, 7, 4, 2, 3, 6, 9, 8, 7, 4, 5, 6 };

        HashSet<Integer> set = new HashSet<>();
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.println(set);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 4, 4 };
        int size = removeDuplicates(arr);
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        removeDupUsingArrayList();

        System.out.println();

        removeDupUsingHashSet();

    }
}
