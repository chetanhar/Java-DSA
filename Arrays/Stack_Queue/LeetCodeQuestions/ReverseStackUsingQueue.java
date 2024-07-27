package Stack_Queue.LeetCodeQuestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseStackUsingQueue {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(reverse(s));
    }
    public static Stack reverse(Stack<Integer> t){
        Stack<Integer> res=new Stack<>();
        Queue<Integer> q=new LinkedList<>();
        while (!t.isEmpty()){
            q.add(t.pop());
        }
        while (!q.isEmpty()){
            res.push(q.poll());
        }
        return res;
    }

}
