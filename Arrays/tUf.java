package Arrays;

import java.util.*;

public class tUf {
    public static int missingNumber(int[] nums) {

        int[] a=new int[4];
        for (int i = 0; i < 4; i++) {
            a[0]++;
        }
        System.out.println(Arrays.toString(a));
        return 1;
    }



    public static void main(String args[]) {
        int a[] = {0,1, 2, 4, 5};

        int ans = missingNumber(a);
        System.out.println("The missing number is: " + ans);
    }

}
