package BitWise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountBits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }

    private static int[] countBits(int n) {
        int[] result = new int[n+1];
        for (int i = 0; i <=n; i++) {
            result[i]=countSetBits(i);
        }
        return result;
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
