package TwoPointer;
public class TargetSum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int target = 7;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                System.out.println("(" + arr[start] + "," + arr[end] + ")");
                start++;
                end--;
                // break;
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
    }
}
