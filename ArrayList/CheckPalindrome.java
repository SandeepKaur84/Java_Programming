package ArrayList;

import java.util.ArrayList;

public class CheckPalindrome {
    public static boolean check(ArrayList<Integer> list) {
        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            if(!list.get(start).equals(list.get(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(4);
        list.add(5);
        System.out.println(check(list));
    }
}
