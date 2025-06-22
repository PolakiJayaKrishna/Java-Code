package Array;

import java.util.Arrays;

//Create a 2x3 integer matrix and print all elements using nested loops.
public class MatrixPrintingDemo {
    public static void main(String[] args) {
        int[][] arr = { { 1, 0 }, { 2, 0 }, { 3, 0 } };
        System.out.println(arr + "                 //This is Memory Address or reference");
        System.out.println();
        System.out.println(Arrays.deepToString(arr) + "     //This is by using Method..");
        System.out.println();
        System.out.println("Below is by using nested loops...");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}