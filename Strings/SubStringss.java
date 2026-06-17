package Strings;

public class SubStringss {

    public static String returnSubString(String str, int si, int ei) {
        String subStr = "";
        for (int i = si; i <= ei; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(returnSubString(str, 1, 3));
    }
}
