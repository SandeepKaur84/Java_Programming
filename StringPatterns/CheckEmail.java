package StringPatterns;

public class CheckEmail {
    public static void main(String[] args) {
        String email = "abc123@gmail.com";
        String pattern = "[a-zA-Z0-9]+@[a-z]+\\.com";
        System.out.println(email.matches(pattern));
    }
}
