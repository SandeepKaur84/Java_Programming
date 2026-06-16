package Day5;



public class Largest {
    public static void main(String[] args) {
        int arr[] = {51,10,58,63,1,2,4,5,6};
        int largest = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
