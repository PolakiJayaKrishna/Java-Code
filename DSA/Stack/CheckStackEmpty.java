// Check if Stack is Empty
// Task: After popping all elements from a stack, check whether it’s empty using isEmpty().

package DSA.Stack;

import java.util.Stack;

public class CheckStackEmpty {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(20);
        stack.push(420);
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());
        stack.pop();
        System.out.println(stack.isEmpty());
    }

}