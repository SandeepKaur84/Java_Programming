public class EvenOddCount {
    public static void countEvenOdd(int arr[][]) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.println("Total even numbers : " + even);
        System.out.println("Total odd numbers : " + odd);
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        countEvenOdd(arr);
    }
}
