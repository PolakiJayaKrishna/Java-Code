package DSA.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(100);
        pq.add(10);
        pq.add(200);
        pq.add(30);
        pq.add(20);
        System.out.println("Highest Priroity: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.remove() + " ");
        }
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(10);
        pq1.add(50);
        pq1.add(40);
        pq1.add(2000);
        pq1.add(25);
        System.out.println();
        System.out.println("Deafult Lowest Priroity: ");
        while (!pq1.isEmpty()) {
            System.out.print(pq1.remove()+ " ");
        }
    }
}
