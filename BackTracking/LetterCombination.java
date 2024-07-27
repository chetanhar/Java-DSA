package BackTracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LetterCombination {
    public static void main(String[] args) {
        List<String>s=letterCombinations("23");
        System.out.println(s);
    }
    public static List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return Collections.emptyList();
        }
        String[] ar={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> output=new ArrayList<>();
        backTrack(ar,output,digits,"");
        return output;
    }

    private static void backTrack(String[] ar, List<String> output, String digits, String combination) {
        if(digits.isEmpty()){
            output.add(combination);
        }else{
            String letters=ar[digits.charAt(0)-'2'];
            for(char letter:letters.toCharArray()){
                    backTrack(ar,output,digits.substring(1),combination+letter);
            }
        }
    }
}
