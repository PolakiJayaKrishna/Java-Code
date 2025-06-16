package Arraylist;

import java.util.ArrayList;

public class Getelement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Intial Value in ArrayList is: " + list.size());
        list.add(1);
        list.add(2);
        list.add(0);
        System.out.println("After Adding Elements in Arraylist: " + list);
        System.out.println("Gettig an Element with index value: " + list.get(1));
    }
}