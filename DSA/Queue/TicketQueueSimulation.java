//Task: Simulate a line of 4 people buying tickets. Remove one by one and show who's next.

import java.util.LinkedList;
import java.util.Queue;

public class TicketQueueSimulation {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Jayakrishna");
        queue.add("Jayakrishna Saketh");
        queue.add("Manoj Charan");
        queue.add("Roopananda Reddy");
        System.out.println("In queue: " + queue);
        System.out.println("Now: " + queue.remove() + "\n" + "Next: " + queue.peek());
        System.out.println("Now: " + queue.remove() + "\n" + "Next: " + queue.peek());
        System.out.println("Now: " + queue.remove() + "\n" + "Next: " + queue.peek());
        System.out.println("Now: " + queue.remove() + "\n" + "Next: " + queue.peek());
        System.out.println(queue.isEmpty());
    }
}
