//Task: Add 2 elements, remove both, then check if queue is empty using isEmpty().

import java.util.LinkedList;
import java.util.Queue;

public class QueueIsEmptyCheck {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        queue.add(1);
        System.out.println(queue);
        queue.remove();
        queue.remove();
        System.out.println(queue.isEmpty());
    }
}
