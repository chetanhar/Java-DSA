package Math;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(21));
    }

    private static boolean isPrime(int n) {
        if (n <=1) {
            return false;
        }if(n<=3){
            return true;
        }if(n==5 || n==7){
            return true;
        }
        if(n%3==0 || n%2==0 || n%5==0 || n%7==0){
            return false;
        }
        return  true;
    }
}
