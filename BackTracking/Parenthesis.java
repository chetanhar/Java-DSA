package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Parenthesis {
    public static void main(String[] args) {
        List<String> s=generateParenthesis(2);
        System.out.println(s);
    }
    public static List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<String>();
        backtrack(res,n,0,0,"");
        return res;
    }

    private static void backtrack(List<String> res, int n, int left, int right, String s) {
        if(s.length()==n*2){
            res.add(s);
            return;
        }
        if(left<n){
            backtrack(res,n,left+1,right,s+"(");
        }if(right<left){
            backtrack(res,n,left,right+1,s+")");
        }


    }
}
