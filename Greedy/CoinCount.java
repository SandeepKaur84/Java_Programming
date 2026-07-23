package Greedy;

public class CoinCount {
    public static void main(String[] args) {
        int coins[] = { 10, 5, 2, 1 };
        int amount = 28;
        int count = 0;

        for (int i : coins) {
            while (amount >= i) {
                amount -= i;
                count++;
            }
        }
        System.out.println(count);
    }
}
