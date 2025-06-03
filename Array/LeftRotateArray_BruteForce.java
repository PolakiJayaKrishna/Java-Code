package Array;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArray_BruteForce {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array is: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the Number.of Shift: ");
        int k = sc.nextInt();
        int temp, size = arr.length;
        k = k % size;
        for (int j = 0; j < k; j++) {
            temp = arr[0];
            for (int i = 1; i < size; i++) {
                arr[i - 1] = arr[i];
            }
            arr[size - 1] = temp;
            ;
        }

        System.out.print(Arrays.toString(arr));
        sc.close();
    }
}
