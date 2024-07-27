package Stack_Queue;

import java.util.Arrays;
import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);// it will insert the element at top
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        //System.out.println(stack.pop());// it will remove the top element
        //System.out.println(stack);
        //System.out.println(stack.peek());//it will return the top element without modifying it
        //System.out.println(stack);
        //stack.removeElementAt(0);
        //System.out.println(stack);
        stack.add(5);
        stack.add(6);
        System.out.println(stack);
        CustomStack cs=new CustomStack();
        cs.push(34);
        cs.push(45);
        cs.push(2);
        cs.push(9);
        cs.push(18);
        cs.push(89);


        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());


    }
}
