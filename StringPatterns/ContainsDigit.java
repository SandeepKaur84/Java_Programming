package StringPatterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContainsDigit {
    public static void main(String[] args) {
        String str = "123";
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(str);

        if (m.matches()) {
            System.out.println("Contains digits");
        } else {
            System.out.println("No digits");
        }
        String num = "12345";
        System.out.println(num.matches("\\d+"));

        String str2 = "java";
        System.out.println(str2.matches("[A-Za-z]+"));
    }
}
