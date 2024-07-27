package Stack_Queue.LeetCodeQuestions;

import java.sql.SQLOutput;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse1("CHETAN"));
    }
    public static String reverse1(String chetan){
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < chetan.length(); i++) {
            stack.push(chetan.charAt(i));
        }
        char[] f=new char[chetan.length()];
        for (int i = 0; i < chetan.length(); i++) {
            f[i]=stack.pop();
        }
        return String.valueOf(f);
    }
}
