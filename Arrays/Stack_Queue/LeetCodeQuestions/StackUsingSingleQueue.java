package Stack_Queue.LeetCodeQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingleQueue {
    static Queue<Integer> first;

    public StackUsingSingleQueue() {
        first = new LinkedList<>();
    }

    public static void main(String[] args) {
        StackUsingSingleQueue r = new StackUsingSingleQueue();
        r.push(1);
        r.push(2);
        r.push(3);
        System.out.println(first);
        System.out.println(pop());
    }

    private static int pop() {
        return first.poll();
    }

    private void push(int n) {
        int x = first.size();
        first.add(n);
        for (int i = 0; i < x; i++) {
            int z=first.remove();
            first.add(z);
        }
    }
}
