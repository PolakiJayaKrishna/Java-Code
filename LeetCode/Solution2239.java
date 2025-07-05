package LeetCode;
public class Solution2239{
	public static void main(String[] args) {
        int[] arr = {-4,-2,1,4,8};
        int closest = arr[0];
        for(int num : arr){
            int positionValue = Math.abs(num);
            int closestValue = Math.abs(closest);
            if(positionValue < closestValue || (positionValue==closestValue && num < closest))
                closest = num;
        }
        System.out.println(closest);
    }
}