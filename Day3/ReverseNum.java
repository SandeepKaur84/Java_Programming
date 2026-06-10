package Day3;

public class ReverseNum {
    public static void reverse() {
        int num = 56987413;
        while (num > 0) {
            int n = num % 10;
            System.out.print(n);
            num = num / 10;
        }
    }

    public static void main(String[] args) {
        reverse();
    }
}
