package Arraylist;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the ArrayList: ");
        int size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);

        Collections.sort(list);
        System.out.println("Sorted ArrayList is: " + list);
    }
}
