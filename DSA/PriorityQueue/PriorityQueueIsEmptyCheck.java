//Remove all elements, then check if the queue is empty using isEmpty().

package DSA.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueIsEmptyCheck {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(20);
        pq.add(110);
        pq.add(40);
        pq.add(550);
        pq.add(30);
        pq.add(10);
        while(!pq.isEmpty()){
            System.out.println("Removed: " + pq.remove());
        }
    }
}
