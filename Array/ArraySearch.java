
import java.util.Scanner;
import java.util.Arrays;
class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array is: " + Arrays.toString(arr));
        
        System.out.println();
        System.out.print("Enter an Element to find in array: ");
        int find = sc.nextInt();
        int temp;
        boolean indexis = false;
        for (int i = 0; i < size; i++) {
            temp = arr[i];
            if(temp == find){
                indexis = true;
                System.out.print("Index value is: " + i);
                break;
            }
        }
        if(!indexis) {
            System.out.println("Element is not found in the given  Array...");
        }
        sc.close();
    }
}