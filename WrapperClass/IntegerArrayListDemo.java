//3. Store 5 ints inside an ArrayList<Integer> and print them

package WrapperClass;
import java.util.ArrayList;
public class IntegerArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(10);
        arrlist.add(20);
        arrlist.add(30);
        arrlist.add(40);
        arrlist.add(50);
        for (Integer num : arrlist) {
        System.out.print(num + " "); // Autounboxing when needed
        }
    }
}
