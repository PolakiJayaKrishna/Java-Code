// Task: Find union of two arrays using HashSet.

package DSA.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetProblem3 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {3,4,5};
        Set<Integer> hashSet = new HashSet<>();
        for (int num  : arr1) {
            hashSet.add(num);
        }
        for (int num  : arr2){
            hashSet.add(num);
        }
        System.out.println(hashSet);
    }
}
