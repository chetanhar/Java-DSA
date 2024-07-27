package String;

public class RemoveParenthesis {
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
    }
    public static String removeOuterParentheses(String s) {
        String ans="";

        int o=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                o++;
                if(o>1) ans+='(';
            }

            else{
                if(o>1) ans+=')';
                o--;
            }
        }

        return ans;
    }

}
