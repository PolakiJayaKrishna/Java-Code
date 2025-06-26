//View Top Element of Stack
//Task: Push three tasks to a stack. Use peek() to show which one is at the top without removing it.

package DSA.Stack;
import java.util.Stack;
public class PeekTopElement {
    public static void main(String[] args) {
        Stack<String> stack  = new Stack<>();
        stack.push("HI");
        stack.push("Iam");
        stack.push("Jk");
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
