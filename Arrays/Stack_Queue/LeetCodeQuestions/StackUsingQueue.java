package Stack_Queue.LeetCodeQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static Queue<Integer> first;
    static Queue<Integer> second;

    public StackUsingQueue() {
        first = new LinkedList<>();
        second = new LinkedList<>();
    }

    public static void main(String[] args) {
        StackUsingQueue r = new StackUsingQueue();
        r.push(1);
        r.push(2);
        r.push(3);
        System.out.println(first);
        System.out.println(pop());
    }

    public static void push(int i) {
        second.add(i);
        while (!first.isEmpty()) {
            second.add(first.poll());
        }
        Queue<Integer> q = second;
        second = first;
        first = q;
    }

    public static int pop() {
        if(first.size()==0 ) return -1;
        return first.poll();
    }
}
