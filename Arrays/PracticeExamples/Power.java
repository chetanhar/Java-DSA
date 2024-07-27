package PracticeExamples;

public class Power {
    public static void main(String[] args) {
        System.out.println(myPow(2,4));
    }
    public static long myPow(long x, int n) {
        if(n==0)return 1;
        long tmp=myPow(x,n/2);
        if(n%2==1)return tmp*tmp*x;
        return tmp*tmp;
    }
}
