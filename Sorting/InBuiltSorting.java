package Sorting;
//O(nlogn)
import java.util.Arrays;
import java.util.Collections;

public class InBuiltSorting {
    public static void main(String[] args) {
        Integer arr[] = {5,4,3,6,8,7,9};
        Arrays.sort(arr , 0 , 4);
        Arrays.sort(arr,0 , 4,  Collections.reverseOrder());
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
