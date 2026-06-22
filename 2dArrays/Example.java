// package 2dArrays;

import java.util.Scanner;

public class Example {

    public static boolean searchElement(int arr[][], int key) {
        for(int i = 0;i < arr.length;i++) {
            for(int j =0; j <arr[0].length;j++) {
                if(arr[i][j] == key) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] =  new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 nums: ");

        for(int i = 0 ; i < matrix.length; i++) {
            for(int j = 0; j<matrix[0].length ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter a key to search : ");
        int key = sc.nextInt();

        System.out.println(searchElement(matrix, key));

        //  for(int i = 0 ; i < matrix.length; i++) {
        //     for(int j = 0; j<matrix[0].length ; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        sc.close();
    }
}
