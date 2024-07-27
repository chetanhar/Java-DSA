package String;

import java.util.ArrayList;
import java.util.HashMap;

public class ReverseWordsClone {
    public static void main(String[] args) {
        System.out.println(reverseWords("   the sky is blue   "));
    }
    public static String reverseWords(String s) {
        String[] c=s.split("\\s+");
        ArrayList<String> sns=new ArrayList<>();
        for (int i = c.length-1; i >=0 ; i--) {
            sns.add(c[i]);
        }
        StringBuilder ans=new StringBuilder();
        for (int i = 0; i < sns.size(); i++) {
            ans.append(sns.get(i)).append(" ");
        }
        return ans.toString().trim();
    }
    public boolean rotateString(String s, String goal) {
        StringBuilder builder=new StringBuilder(goal);
        builder.append(goal);
        if(builder.indexOf(s)!=-1){
            return true;
        }
       return false;
    }

}
