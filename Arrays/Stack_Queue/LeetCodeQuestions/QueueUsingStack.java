package Stack_Queue.LeetCodeQuestions;

import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        System.out.println(q.pop());
        System.out.println(q.pop());
        q.display();
        System.out.println(q.peek());
        q.display();

    }

    public void display() {
        System.out.println(first);
    }

    public QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item) {
        first.push(item);
    }
    public int pop(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed= second.pop();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }
    public int peek(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int value=second.peek();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return value;
    }


}
