package Strings;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "lleohm";

        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a, b)) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Not anagrams");
        }
    }
}
