package HashSet;

import java.util.HashSet;

public class RemoveDup {

    public static void checkDuplicates(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        boolean checkDup = false;
        for(int i : arr) {
            if(set.contains(i)) {
                checkDup = true;
                break;
            }
            set.add(i);
        }
        System.out.println(checkDup);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2};
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr) {
            set.add(i);
        }
        System.out.println(set);
        checkDuplicates(arr);
    }
}
