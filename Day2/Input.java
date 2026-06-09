package Day2;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println(name);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        System.out.println(num);

        sc.nextLine();

        System.out.print("Enter any name again: ");
        String name2 = sc.next();
        System.out.println(name2);
        sc.close();
    }
}
