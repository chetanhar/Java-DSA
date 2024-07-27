package Stack_Queue.LeetCodeQuestions;

import java.util.HashMap;
import java.util.Stack;

public class MinAddToMakeValid {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("()))(("));
    }
    public static int minAddToMakeValid(String s){
        Stack<Character> stack=new Stack<>();
        for (char c:s.toCharArray()
             ) {
            if(c==')'){
                if(!stack.isEmpty()&&stack.peek()=='('){
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }else {
                stack.push(c);
            }
        }
        return stack.size();
    }

}
