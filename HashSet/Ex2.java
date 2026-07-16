package HashSet;

import java.util.HashSet;

public class Ex2 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set);
        set.add(20);
        System.out.println(set);
        
        int arr1[] = {1,2,3,4};
        int arr2[] = {3,4,5,6};

        HashSet<Integer> s1 = new HashSet<>();
        for(int i : arr1) {
            s1.add(i);
        }

        for(int i : arr2) {
            s1.add(i);
        }

        System.out.println(s1);

    }
}
