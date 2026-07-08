package HashMap;

import java.util.HashMap;

public class CountFreq {
    public static void main(String[] args) {
        int arr[] = {2,1,4,5,1,3,6,2,2,2};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);
    }
}
