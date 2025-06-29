package DSA.Sorting;
public class LinearSearchSolution {

    // Method to search for the target in the array
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    // Main method for testing the search method
    public static void main(String[] args) {
        LinearSearchSolution solution = new LinearSearchSolution();

        int[] nums = {4, 5, 6, 7, 8, 9};
        int target = 7;

        int result = solution.search(nums, target);

        if (result != -1) {
            System.out.println("Target " + target + " found at index: " + result);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}
