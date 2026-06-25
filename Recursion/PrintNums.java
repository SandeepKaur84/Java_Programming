package Recursion;

public class PrintNums {
    public static void oneToN(int n) {
        if (n == 0) {
            return;
        }
        oneToN(n - 1);
        System.out.print(n + " ");
    }

    public static void NToOne(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        NToOne(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        oneToN(n);
        System.out.println();
        NToOne(n);
    }
}
