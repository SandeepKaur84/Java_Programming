package Arrays;

public class LinearSearch {
    public static int LS(int arr[] , int key) {
        for(int i = 0; i <= arr.length; i++){
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {5,8,9,6,7,10,45,85,36};
        int key = 36;
        System.out.println(LS(arr, key));
    }
}
