package Recursion;

public class DigitProduct {
    public static void main(String[] args) {
        System.out.println(product(5432));
    }

    private static int product(int n) {
        if(n%10==n){
            return n;
        }
        return product(n/10)*(n%10);
    }
}
