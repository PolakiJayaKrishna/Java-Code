package Sorting;

import java.util.Arrays;

public class CountingSortDemo {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,6,7,1,5,2,3,0,9};
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest , arr[i]);
        }
        int[] count = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
