package Day3;

import java.util.Scanner;

public class ForLoop {

    public static void printReverseList() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
        sc.close();
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
        System.out.println(i);
        }
        // printReverseList();
    }
}
