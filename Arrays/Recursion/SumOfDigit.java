package Recursion;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(5543));
    }

    private static int sumOfDigit(int n) {
        if(n==0){
            return n;
        }
        return sumOfDigit(n/10)+(n%10);
    }

}
