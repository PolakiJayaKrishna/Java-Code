package Arraylist;

import java.util.ArrayList;

public class AddingAtIndex {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Intial Value in ArrayList is: " + list.size());
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("After Adding Elements in Arraylist: " + list);
        list.set(0, 0);
        list.set(1, 1);
        list.set(2, 2);
        System.out.println("After Changing Values using Set Method: " + list);
    }
}
