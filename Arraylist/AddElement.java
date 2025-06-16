package Arraylist;

import java.util.ArrayList;

public class AddElement{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Intial Value in ArrayList is: "  + list.size());
        list.add(1);
        list.add(2);
        list.add(0);
        System.out.println("After Adding Elements in Arraylist: " + list);
    }
}