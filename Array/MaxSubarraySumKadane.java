//What is the maximum subarray sum for the array [−2,−3,4,−1,−2,1,5,−3] using Kadane's Algorithm?
public class MaxSubarraySumKadane {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currentSum += arr[i];
            if(currentSum <0)
                currentSum = 0;
            maxSum = Math.max(currentSum , maxSum);
        }
        System.out.println("Current Sum: " + currentSum);
        System.out.println("Maximum Sum: " + maxSum);
    }
}
