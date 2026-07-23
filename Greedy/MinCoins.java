package Greedy;

public class MinCoins {
    public static void main(String[] args) {
        int[] coins = { 200, 100, 50, 20, 10, 5, 2, 1 };
        int amount = 275;
        for (int coin : coins) {
            while (amount >= coin) {
                System.out.print(coin + " ");
                amount -= coin;
            }
        }
    }
}
