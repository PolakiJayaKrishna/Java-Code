// Merges two arrays by multiplying their elements at matching indices and then adding the rest.

package Array;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayAppend {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of First Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------------------------");
        System.out.print("Enter Size of Second Array: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.print("Enter Elements: ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println("---------------------------------");
        int temp = 0, min = 0;
        if (size2 > size) {
            temp = size2;
            min = size;
        } else {
            temp = size;
            min = size2;
        }
        int[] arr3 = new int[temp];
        for (int i = 0; i < min; i++) {
            arr3[i] = arr[i] * arr2[i];
        }
        for (int i = min; i < temp; i++) {
            if (size2 > size) {
                arr3[i] = arr2[i];
            } else {
                arr3[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr3));
        sc.close();
    }
}