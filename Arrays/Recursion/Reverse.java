package Recursion;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(rev2(4345));
    }

    static int sum = 0;

    private static int reverse(int n) {
        if (n == 0) {
            return sum;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        return reverse(n / 10);
    }
    private static boolean palindrome(int n){
        return n==reverse(n);
    }
    private static int rev2(int n){
         int digits= (int)Math.log10(n)+1;
         return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1)+helper(n/10,digits-1);
    }
}
