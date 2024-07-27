package Stack_Queue.LeetCodeQuestions;

import netscape.security.UserTarget;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> ch = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                ch.push(c);
            } else {
                if (c == ')') {
                    if (ch.isEmpty() || ch.pop() != '(') {
                        return false;
                    }
                }
                if (c == '}') {
                    if (ch.isEmpty() || ch.pop() != '{') {
                        return false;
                    }
                }
                if (c == ']') {
                    if (ch.isEmpty() || ch.pop() != '[') {
                        return false;
                    }
                }
            }
        }
        return ch.isEmpty();
    }
}
