package Day3;

import java.util.Scanner;

public class DoWhileLoop {
    public static void checkMultiple() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter numbers : ");
            int nums = sc.nextInt();
            if (nums % 10 == 0) {
                break;
            }
            System.out.println("Number was : " + nums);
        } while (true);
        sc.close();
    }

    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

        checkMultiple();
    }
}
