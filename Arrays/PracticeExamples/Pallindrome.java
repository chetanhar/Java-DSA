package PracticeExamples;

public class Pallindrome {
    public static void main(String[] args) {
        String val="abcba";
        boolean result=checkPalindrome(val);
        System.out.println(result);
    }

    private static boolean checkPalindrome(String val) {
        if(val==null||val.length()==0){
            return true;
        }
        for (int i = 0; i <= val.length()/2; i++) {
            char start=val.charAt(i);
            char end=val.charAt(val.length()-1-i);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
