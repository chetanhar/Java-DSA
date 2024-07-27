package BitWise;

public class SetBits {
    public static void main(String[] args) {
        int n=3;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(countSetBits(n));
    }

    private static int countSetBits(int n) {
        int count=0;
        while(n>0){
            n -= (n & -n);
           // n=n&(n-1);
            count++;
        }
           return count;

    }
}

