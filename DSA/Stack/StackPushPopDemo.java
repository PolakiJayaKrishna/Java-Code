// Push 5 numbers to a Stack<Integer>. Pop the top 2 numbers and print the remaining stack.

package DSA.Stack;
import java.util.Stack;
public class StackPushPopDemo {
    public static void main(String[] args) {
        Stack<Integer> stack  = new Stack<>();
        System.out.println(stack);
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);
    }
}
