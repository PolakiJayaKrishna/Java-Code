
//Check if the list contains a specific number and print its index. If not found, print "Not Found"
package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchNumberInArrayList {

    public class Matrix {
        public static void main(String[] args) {
            ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 0, 515, -1, -10, 0));
            int num = 0;
            boolean isFound = false;
            for (int i = 0; i < arrayList.size(); i++) {
                if (num == arrayList.get(i)) {
                    System.out.println("At Index: " + i);
                    isFound = true;
                }
            }
            if (!isFound)
                System.out.println("Not Found..!");
        }
    }
}
