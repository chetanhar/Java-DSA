package Math;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(4, 9));
        System.out.println(lcm(2, 7));
    }

    private static int lcm(int i, int i1) {
        return (i*i1)/gcd(i,i1);
    }

    private static int gcd(int i, int j) {
        if(i==0){
            return j;
        }
        return gcd(j%i,i);
    }
}
