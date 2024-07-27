package String;

import java.util.ArrayList;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
    public static String reverseWords(String s) {
        String[] st=s.split("\\s+");
        ArrayList<String> re=new ArrayList<>();
        for (int i = st.length-1; i >= 0; i--) {
            re.add(st[i]);
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < re.size(); i++) {
            sb.append(re.get(i)).append(" ");
        }
        return sb.toString().trim();
    }
}
