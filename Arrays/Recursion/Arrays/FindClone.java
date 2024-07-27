package Recursion.Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindClone {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
//        System.out.println(find(nums, 5, 0));
//        printNto1(5);
//        System.out.println();
//        print1toN(5);
        //System.out.println(sum(5));
        //System.out.println(Arrays.toString(generateFibonacciNumbers(5)));
        System.out.println(removeNonAlphNumericCharacter());
        List<Integer> val=new ArrayList<>();
    }

    private static int find(int[] args, int target, int index) {
        if (index == args.length) {
            return -1;
        }
        if (args[index] == target) {
            return index;
        }
        return find(args, target, index + 1);
    }

    private static void printNto1(int index) {
        if (index == 0) {
            return;
        }
        System.out.print(index + " ");
        printNto1(index - 1);
    }

    private static void print1toN(int index) {
        int start = 1;
        print1toN(start, index);
    }

    private static void print1toN(int start, int index) {
        if (start == index+1) {
            return;
        }
        System.out.print(start+" ");
        print1toN(start + 1, index);
    }
    private static int sum(int index) {
        if(index==1){
            return 1;
        }
         int sum=index;
         sum+=sum(index-1);
         return sum;
    }
    public static List<String> printNtimes(int n){
        List<String> s=new ArrayList<>();
        if(n==1){
            s.add("Coding Ninjas ");
        }
        s.addAll(printNtimes(n-1));
        return s;
    }
    public static int[] generateFibonacciNumbers(int n) {
        int[] result=new int[n];
        result[0]=0;
        result[1]=1;
        for(int i=2;i<n;i++){
            result[i]=result[i-1]+result[i-2];
        }
        return result;
    }
    public static boolean removeNonAlphNumericCharacter() {
        String c = "Hello123!$%^&*";
        String or=removeNonAlphNumericCharacter(c);
        System.out.println(or);
        return false;
    }

    private static String removeNonAlphNumericCharacter(String c) {
        return c.replaceAll("[^a-zA-Z0-9]","");
    }

    public boolean isPalindrome(String s) {
        String snew=s.replaceAll("[^a-zA-Z0-9]","");
        String cp=snew.toLowerCase();
//        char[] t= cp.toCharArray();
//        for (int i = 0; i < t.length/2; i++) {
//            if(t[i]!=t[t.length-i-1]){
//                return false;
//            }
//        }
        return check(cp.toCharArray(),0,cp.length());
    }
    private static boolean check(char[] ch,int start,int end){
        if(start>end){
            return true;
        }
        if(ch[start]!=ch[end]){
            return false;
        }
        return check(ch,start+1,end-1);
    }
    public int myAtoi(String s) {
        s=s.trim();
        if(s.isEmpty()){
            return 0;
        }
        int ans=0,i=0;
        boolean neg=s.charAt(0)=='-';
        boolean pos=s.charAt(0)=='+';
        if(neg||pos){
            i++;
        }
        while(i<s.length()&&Character.isDigit(s.charAt(i))){
            int digit=Character.getNumericValue(s.charAt(i));
            ans=ans*10+digit;
            i++;
        }
        return neg ? -ans : ans;

    }


}
