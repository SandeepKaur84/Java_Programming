package StringBuilder;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madaam";
        StringBuilder sb = new StringBuilder("madam");
        sb.reverse();
        if (str.equals(sb.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

    }
}
