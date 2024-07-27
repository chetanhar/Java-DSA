package Stack_Queue.LeetCodeQuestions;

import java.util.Stack;

public class RemoveConsecutiveSame {
    public static void main(String[] args) {
        String[] ar = {"prep", "bytes", "bytes", "prep", "dsa"};
        System.out.println(removeConsecutiveSame(ar));
    }

    private static int removeConsecutiveSame(String[] ar) {
        Stack<String> stack = new Stack<>();
        stack.push(ar[0]);
        for (int i = 1; i < ar.length;i++) {
            if(!stack.isEmpty()&&ar[i]==stack.peek()){
                stack.pop();
            }
            else{
                stack.push(ar[i]);
            }
        }
        return stack.size();
    }
}
