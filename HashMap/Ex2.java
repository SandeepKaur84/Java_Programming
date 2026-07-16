package HashMap;

import java.util.HashMap;

public class Ex2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.putIfAbsent(3, "C");
        System.out.println(map);
        System.out.println(map.getOrDefault(4, "ABC"));
        for (int i : map.keySet()) {
            System.out.println(i);
        }

        for (String i : map.values()) {
            System.out.println(i);
        }
    }
}
