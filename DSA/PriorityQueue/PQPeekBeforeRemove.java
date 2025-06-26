//Task: Add numbers, and before each remove(), show peek().

package DSA.PriorityQueue;

import java.util.PriorityQueue;

class PQPeekBeforeRemove{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(20);
        pq.add(110);
        pq.add(40);
        pq.add(550);
        pq.add(30);
        pq.add(10);
        System.out.println("Peek: " + pq.peek());
        System.out.println("Removed: " + pq.remove());
        System.out.println("Peek: " + pq.peek());
        System.out.println("Removed: " + pq.remove());
        System.out.println("Peek: " + pq.peek());
        System.out.println("Removed: " + pq.remove());
        System.out.println("Peek: " + pq.peek());
        System.out.println("Removed: " + pq.remove());
        System.out.println("Peek: " + pq.peek());
        System.out.println("Removed: " + pq.remove());
    }
}