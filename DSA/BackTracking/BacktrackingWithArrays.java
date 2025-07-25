// write a function to update its elements using recursion and backtracking. The function should modify the original array by applying a transformation (such as setting each index to its value minus the previous index) and demonstrate how changes can be reverted (backtracked) to their original state.

package DSA.BackTracking;

public class BacktrackingWithArrays {
    public static void main(String[] args) {
        int[] arr = new int[5]; // Creating An Array
        recursion(arr, 0, 1); // Method1 Call
        printArray(arr);
    }

    public static void recursion(int[] arr, int i, int val) { // This is the Method1
        // BaseCase
        if (i == arr.length) {
            printArray(arr); // Method2 Call
            return;
        }
        // Recurrsion
        arr[i] = val;
        recursion(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }

    public static void printArray(int[] arr) { // To print the array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
