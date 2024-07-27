package Interview;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq=new PriorityQueue<>(Comparator.naturalOrder());
        pq.offer(5);
        pq.offer(1);
        pq.offer(2);
        pq.offer(4);
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
