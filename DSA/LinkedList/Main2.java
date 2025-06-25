//Add Urgent Task at Beginning

package DSA.LinkedList;
import java.util.LinkedList;
public class Main2{
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
        list.forEach(System.out::println);
    }
}



