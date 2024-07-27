package String;

public class LargestODDNo {
    public static void main(String[] args) {
        String c=largestOddNumber("10133890");
        System.out.println(c);
    }
    public static String largestOddNumber(String nu) {
        Long num=Long.parseLong(nu);
        if(num%2!=0){
            return Long.toString(num);
        }
        if(num%2==0){
            while(num>0){
                if((num%10)%2!=0){
                    return Long.toString(num);
                }
                else{
                    num=num/10;
                }
            }
        }
        return "";
    }
}
