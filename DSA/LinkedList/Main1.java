// Add and Display Tasks
package DSA.LinkedList;
import java.util.LinkedList;
public class Main1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("BreakFast");
        list.add("Lunch");
        list.add("Dinner");
        // for(String str : list){
        //     System.out.println(str);
        // }
        list.forEach(System.out::println);
    }
}
