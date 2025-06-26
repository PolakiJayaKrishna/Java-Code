//Task: Job times: [7, 2, 9, 1]. The scheduler runs the shortest job first.

package DSA.PriorityQueue;

import java.util.PriorityQueue;

public class JobSchedulerPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(7);
        pq.add(2);
        pq.add(9);
        pq.add(1);
        while(!pq.isEmpty()){
            System.out.println("Shortest Job: " + pq.remove());
        }
    }
}
