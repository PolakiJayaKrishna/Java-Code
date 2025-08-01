package DSA.hashmap;

import java.util.Map;
import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> hMap = new HashMap<>();
        int i = 0;
        for (int num : nums) {
            if (hMap.containsKey(num)) {
                return true;
            } else {
                hMap.put(num, i);
                i++;
            }
        }
        return false;
    }
}