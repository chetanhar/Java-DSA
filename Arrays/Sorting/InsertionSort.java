package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums={5,4,3,7,2,1};
        insertionsort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void insertionsort(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                    if(nums[j]<nums[j-1]){
                        int tmp=nums[j];
                        nums[j]=nums[j-1];
                        nums[j-1]=tmp;
                    }else{
                        break;
                    }
            }
        }
    }
}
