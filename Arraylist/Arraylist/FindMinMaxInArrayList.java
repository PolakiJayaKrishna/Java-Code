// Find and print the largest and smallest numbers in the list.
package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMinMaxInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 0, 515, -1, -10, 0));
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arrayList.size(); i++) {
            int temp = arrayList.get(i);
            if (max < temp) {
                max = temp;
            }
            if (min > temp) {
                min = temp;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
