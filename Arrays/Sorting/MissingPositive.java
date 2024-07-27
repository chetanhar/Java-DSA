package Sorting;

import java.util.Arrays;

public class MissingPositive {
    public static void main(String[] args) {
        int[] nums={7,8,9,12};
        int result=missing(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(result);
    }

    private static int missing(int[] nums) {
        int i=0;
        while(i < nums.length){
            int correctIndex=nums[i]-1;
            if(nums[i]>0&&nums[i]<= nums.length&&nums[i]!=nums[correctIndex]){
                int tmp=nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=tmp;
            }else{
                i++;
            }
        }
        int j;
        for (j=0; j < nums.length; j++) {
            if(j+1!=nums[j]&&(j+1)< nums.length){
                return j+1;
            }

        }
        return j+1;
    }
}
