package DSA.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FirstNonDuplicate {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 3, 5};
        find(arr);
    }
    public static void find(int[] arr){
        Map<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(i))
                map.put(arr[i] , i);
            else 
                map.get(i);
        }
    }

}
