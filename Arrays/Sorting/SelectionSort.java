package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1};
        selectionsort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void selectionsort(int[] nums) {
        int start=0;
        for (int i = 0; i < nums.length; i++) {
            int end=nums.length-i-1;
            int max=getmaxindex(nums,start,end);
                int tmp=nums[max];
                nums[max]=nums[end];
                nums[end]=tmp;
            }

        }

    private static int getmaxindex(int[] nums, int start, int end) {
        int max=0;
        for (int j = start; j <= end; j++) {
            if (nums[max] < nums[j]) {
                max = j;
            }
        }
        return max;
    }
}
