package Recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }

    private static int fibo(int i) {
        if(i<2){
            return i;
        }
        return fibo(i-1)+fibo(i-2);
    }
}
