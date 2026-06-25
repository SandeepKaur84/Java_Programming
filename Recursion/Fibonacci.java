package Recursion;

public class Fibonacci {

    public static int fibb(int n) {
        if(n == 0 || n == 1){
            return n;
        }

        return fibb(n - 1) + fibb(n - 2);
    }
    public static void main(String[] args) {
        // 0 1
        // 0 1 1 2 3 5 8 13 .......
        int num1 = 0;
        int num2 = 1;
        int n = 10;
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");

        for (int i = 0; i <= n; i++) {
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(num3 + " ");

        }
        System.out.println();
        int n2 = 4;
        System.out.println(fibb(n2));
    }
}
