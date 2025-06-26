package DSA.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(200);
        pq.add(30);
        pq.add(410);
        pq.add(5);
        System.out.println(pq);
        System.out.println("Top Priority: " + pq.peek());
        while(!pq.isEmpty()){
            System.out.println("Removed: " + pq.remove());
        }
    }
}
