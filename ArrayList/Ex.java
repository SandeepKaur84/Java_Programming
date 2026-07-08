package ArrayList;

import java.util.ArrayList;

public class Ex {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        // int arr2[] = new int[5];
        // System.out.println(arr);
       for(int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
       }
       ArrayList<Integer> arrList = new ArrayList<>();
       arrList.add(1);
       arrList.add(2);
       arrList.add(3);
       arrList.add(4);
       System.out.println(arrList);
       arrList.add(5);
       System.out.println(arrList);
       
       System.out.println(arrList.get(3));
    }
}
