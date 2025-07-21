

import java.util.Scanner;
import java.util.Arrays;

public class ArrayReversewithoutMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Before Reversing: " + Arrays.toString(arr));
        int j = size - 1, first, end;
        for (int i = 0; i < size / 2; i++) {
            first = arr[i];
            end = arr[j];
            arr[i] = end;
            arr[j] = first;
            j--;
        }
        System.out.println("Array After Reversing: " + Arrays.toString(arr));
        sc.close();
    }
}
