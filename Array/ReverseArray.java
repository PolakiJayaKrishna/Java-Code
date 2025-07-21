//Write a Java program to reverse the elements of a given array without using any built-in reverse methods.
//You must perform the reversal in-place using the two-pointer approach.



import java.util.Arrays;

public class ReverseArray{
    public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
       int size = arr.length - 1;

       for (int i = 0; i < arr.length / 2; i++) {
           int temp = arr[size - i];
           arr[size - i] = arr[i];
           arr[i] = temp;
       }

       System.out.println(Arrays.toString(arr));
    }
}
