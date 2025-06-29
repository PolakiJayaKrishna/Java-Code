// ✅ LeetCode 704 - Binary Search
package DSA.Sorting;
public class BinarySearch704 {
    public static int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;
            else if (target > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 12};
        int target = 10;

        int result = search(nums, target);

        if (result != -1)
            System.out.println("Target found at index: " + result);
        else
            System.out.println("Target not found in the array.");
    }
}
