//Depth MergeSort
package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6,3,9,2,5,8};
        sort(arr , 0 ,arr.length-1);
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
    public static void sort(int[] arr , int start ,int end){
        if(start >=end) return;
        int mid = start+(end - start)/ 2;
        sort(arr , start , mid);
        sort(arr , mid+1 , end);
        merge(arr , start , mid , end);
    }
    public static void merge(int[] arr , int start , int mid , int end){
        int[] temp = new int[end - start+1];
        int i = start;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=end){
            if(arr[i] < arr[j]){
               temp[k] = arr[i];
               i++; 
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;    
        }
        while (i<=mid)
            temp[k++] = arr[i++];
        while (j<=end)
            temp[k++] = arr[j++];
        for(int l = 0; l < temp.length; l++){
            arr[start+l] = temp[l];
        }
    }
}
