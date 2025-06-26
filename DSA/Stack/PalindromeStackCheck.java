// Palindrome Check Using Stack
//Task: Check if a word like "madam" is a palindrome using a stack.

package DSA.Stack;
import java.util.Stack;
public class PalindromeStackCheck {
    public static void main(String[] args) {
        Stack<String> stack  = new Stack<>();
        stack.push("m");
        stack.push("a");
        stack.push("d");
        stack.push("a");
        stack.push("m");
        System.out.println("Before: " +"\n" +  stack);
        System.out.println("------------");
        System.out.println("After: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(stack.pop());
        }
    }
}
