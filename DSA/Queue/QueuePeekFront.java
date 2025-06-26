//Task: Add 3 tasks to a queue. Use peek() to show the current task without removing.

import java.util.LinkedList;
import java.util.Queue;

public class QueuePeekFront {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        queue.add(1);
        queue.add(2);
        System.out.println(queue.peek());
    }
}
