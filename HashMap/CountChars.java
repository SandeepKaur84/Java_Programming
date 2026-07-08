package HashMap;

import java.util.HashMap;

public class CountChars {
    public static void main(String[] args) {
        String s = "programming";
        HashMap<Character, Integer> count = new HashMap<>();
        for(char ch : s.toCharArray()) {
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }
        System.out.println(count);
    }
}
