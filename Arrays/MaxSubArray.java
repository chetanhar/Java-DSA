package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxSubArray {
    public static void main(String[] args) {
        System.out.println(longestSubarrayWithSumK(new int[]{8,15, 17, 0,11},17));
    }
    public static int longestSubarrayWithSumK(int []a, long k) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int sum = 0;
                for (int d = i; d <= j; d++) {
                    sum += a[d];

                }
                if (sum == k) {
                    count = Math.max(j - 1 + 1, count);
                }
            }
            return count;
        }
        return -1;
    }
}
