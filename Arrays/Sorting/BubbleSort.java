package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums={1, 2, 3, 4, 5};
        bubblesort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void bubblesort(int[] nums) {
        boolean swapped=false;
        for (int i = 0; i < nums.length; i++) {
            for (int j=1; j< nums.length-i; j++){
                if(nums[j]<nums[j-1]){
                    int tmp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=tmp;
                    swapped=true;
                    
                }
            }
            if(!swapped){
                break;
            }

        }
    }
}
