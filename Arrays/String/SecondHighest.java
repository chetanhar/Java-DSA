package String;

import java.util.*;

public class SecondHighest {
    public static void main(String[] args) {
        System.out.println(secondHighest("ck077"));
    }
    public static int secondHighest(String s) {
        String ans="";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=48&&s.charAt(i)<=57){
                ans+=s.charAt(i);
            }
        }
        if(s.isEmpty()){
            return -1;
        }
        ArrayList<Integer> al=new ArrayList<>();
        for (int i = ans.length()-1; i >=0 ; i--) {
            if(!al.contains(Character.getNumericValue(ans.charAt(i)))){
                al.add(Character.getNumericValue(ans.charAt(i)));
            }
        }
        Collections.sort(al, Comparator.reverseOrder());
        System.out.println(al);
        if(al.size()<2)return -1;
        return al.get(1);
    }
}
