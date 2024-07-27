package String;

public class RotateString {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde","cdeab"));
    }
    public static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        StringBuilder sb=new StringBuilder(goal);
        sb.append(goal);
        if(sb.indexOf("abcde")!=-1){
            return true;
        }else{
            return false;
        }
    }
}
