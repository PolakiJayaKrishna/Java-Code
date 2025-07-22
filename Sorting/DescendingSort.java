package Sorting;

import java.util.Arrays;
import java.util.Collections;
public class DescendingSort {
    public static void main(String[] args) {
        Integer[] arr = {10,20,30,100,1,2,3,7,9};       //Only for Object    
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
