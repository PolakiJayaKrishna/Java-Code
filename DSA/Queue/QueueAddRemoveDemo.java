//Task: Add 5 names to a queue. Remove 2 and print the queue after each operation.

import java.util.LinkedList;
import java.util.Queue;
public class QueueAddRemoveDemo {
	public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("HI");
        queue.add("I am");
        queue.add("Jk");
        System.out.println(queue);
        queue.remove();
        queue.remove();
        System.out.println(queue);
    }
}
