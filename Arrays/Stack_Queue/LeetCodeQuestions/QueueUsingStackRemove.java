package Stack_Queue.LeetCodeQuestions;

import java.util.Stack;

public class QueueUsingStackRemove {
    private Stack<Integer> first;
    private Stack<Integer> second;
    public QueueUsingStackRemove() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public static void main(String[] args) {
        QueueUsingStackRemove q=new QueueUsingStackRemove();
        q.add(1);
        q.add(2);
        q.display();
        System.out.println(q.pop());
        q.display();
        System.out.println(q.peek());
    }
    public void display(){
        System.out.println(first);
    }

    public void add(int item){
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(item);
        while (!second.isEmpty()){
            first.push(second.pop());
        }
    }
    public int pop(){
        return first.pop();
    }
    public int peek(){
        return first.peek();
    }
}
