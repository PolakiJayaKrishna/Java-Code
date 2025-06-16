package Arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class AddingElements {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter Size of an ArrayList: ");
        int size = sc.nextInt();
        ArrayList<Integer> list  = new ArrayList<>();
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        System.out.println("By using Method : " + list);
        System.out.println("This is By For loop");
        for(int i=0;i<size;i++){
            System.out.print(list.get(i) + " ");
        }   
        System.out.println();
        System.out.println("Enter Index Value to get the value: ");
        int Index = sc.nextInt();
        list.get(Index);
        System.out.println("Enter Index value to remove from list: ");
        int remove = sc.nextInt();
        list.remove(remove);
        System.out.println("After remove list is: " + list);
        
    }
}
