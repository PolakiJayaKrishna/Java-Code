//Reverse a Word Using Stack
//Task: Reverse the string "KARE" using Stack<Character>.

package DSA.Stack;
import java.util.Stack;
public class ReverseWordWithStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("K");
        stack.push("A");
        stack.push("R");
        stack.push("E");
        System.out.println(stack);
        for(int i=0;i<=3;i++){
            System.out.print(stack.pop() + " ");
        }
    }
}
