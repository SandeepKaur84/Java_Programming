package Recursion;

public class NaturalNums {
    public static int sumOfNatural(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfNatural(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfNatural(n));
    }
}
