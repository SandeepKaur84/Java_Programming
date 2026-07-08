package HashMap;

import java.util.HashMap;

public class Example {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "ABC");
        map.put(2, "XYZ");
        map.put(3, "PQR");
        System.out.println(map);
        System.out.println(map.get(2));
        map.putIfAbsent(4, "QWE");
        System.out.println(map);
        System.out.println(map.getOrDefault(1, "N"));

        for(HashMap.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
