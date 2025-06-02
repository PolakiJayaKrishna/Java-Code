package Array;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayMin_Max
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is: " + Arrays.toString(arr));
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (firstMax < arr[i]) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (secondMax < arr[i] && firstMax != arr[i]) {
                secondMax = arr[i];
            }
        }
        for (int i = 0; i < size; i++) {
            if (firstMin > arr[i]) {
                secondMin = firstMin;
                firstMin = arr[i];
            } else if (secondMin > arr[i] && firstMin != arr[i]) {
                secondMin = arr[i];
            }
        }
        System.out.println("--------------------------------");
        System.out.println("First Maximum value is: " + firstMax);
        System.out.println("Second Maximum value is: " + secondMax);
        System.out.println("--------------------------------");
        System.out.println("First Minimum value is: " + firstMin);
        System.out.println("Second Minimum value is: " + secondMin);
        System.out.println("--------------------------------");
        sc.close();
    }
}