package DSA.Sorting;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findIndex(nums, target, true);
        int last = findIndex(nums, target, false);
            return new int[] {first, last};
        }

    public int findIndex(int[] nums, int target, boolean findFirst) {
        int index = -1;
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                index = mid;
                if (findFirst)
                    high = mid - 1; // Search left half
                else
                    low = mid + 1;  // Search right half
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return index;
    }
}

