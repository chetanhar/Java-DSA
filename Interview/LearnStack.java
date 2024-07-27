package Interview;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("animal");
        stack.push("dog");
        stack.push("cf");
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);

    }
}
