import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println(name);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        System.out.println(num);
        sc.close();
    }
}
