package HashMap;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 9, 11 };
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int need = target - arr[i];
            if (map.containsKey(need)) {
                System.out.println(need + " " + arr[i]);
            }
            System.out.println("Executed");
            map.put(arr[i], i); // 2,0
        }
    }
}
