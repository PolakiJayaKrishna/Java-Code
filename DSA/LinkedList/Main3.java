
//Remove Completed Task
package DSA.LinkedList;

import java.util.LinkedList;
public class Main3{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("BreakFast");
        list.add("Lunch");
        list.add("Dinner");
        list.addFirst("Brush");
        list.addLast("Sleep");
        // for(String str : list){
        //     System.out.println(str);
        // }
        System.out.println("Before Removing: ");
        list.forEach(System.out::println);
        System.out.println("After Removing: ");
        list.removeFirst();
        list.forEach(System.out::println);
    }
}




