package Strings;

public class CheckEquality {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str3);
        if(str1 == str2) {
            System.out.println("Success");
        }
        if(str1 == str3) {
            System.out.println("Sucess");
        }else {
            System.out.println("Loss");
        }
        if(str1.equals(str3)) {
            System.out.println("Sucees - equal");
        }
    }
}

