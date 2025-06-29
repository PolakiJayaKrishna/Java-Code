package DSA.Sorting;

// ✅ LeetCode 35 - Search Insert Position

public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return low; // position where it should be inserted
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;

        int position = searchInsert(nums, target);
        System.out.println("Target should be at index: " + position);
    }
}
