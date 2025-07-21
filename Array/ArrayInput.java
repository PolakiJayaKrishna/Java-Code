import java.util.Scanner;
import java.util.Arrays;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an Array: ");
        int size = sc.nextInt();
        System.out.print("Enter Elements: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is: " + Arrays.toString(arr));
        int count =0;

        for (int i = 0; i < size; i++) {
            if(arr[i]%2==0){
                count+= arr[i];
            }
        }
        System.out.println("Sum of Even numbers in the Arrays are : " + count);
        sc.close();
    }
}