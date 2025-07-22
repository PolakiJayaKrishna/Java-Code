//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

public class TrappingRainwater {
    public static void main(String[] args) {
        int[] arr = {4,2,0,6,3,2,5};
        calculateMaxWater(arr);
    }
    public static void calculateMaxWater(int[] arr){
        int[] lr = new int[arr.length]; //lr ->Left to Right
        int[] rl = new int[arr.length]; //rl ->Right to left
        lr[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            lr[i] = Math.max(arr[i] , lr[i-1]);
        }
        rl[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rl[i] = Math.max(arr[i] , rl[i+1]);
        }
        int total = 0;
        for(int i=0;i<arr.length;i++){
            total = total + Math.min(lr[i] , rl[i]) - arr[i];
        }
        System.out.println(total);
    }
}