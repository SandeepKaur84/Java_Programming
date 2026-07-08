package ArrayList;

import java.util.ArrayList;

public class CheckPalin {

    public static boolean checkPalinNum(ArrayList<Integer> list) {
        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            if(!list.get(start).equals(list.get(end))) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        System.out.println(checkPalinNum(list));
    }
}
