package LinearSearch;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        //int[] output=reversearray(nums);
        int[] output=reverse(nums);
        System.out.println(Arrays.toString(output));
    }

    //one way
    private static int[] reversearray(int[] nums) {
        int[] tmp=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            tmp[i]=nums[nums.length-(i+1)];
        }
        return tmp;
    }
    //other way
    private static int[] reverse(int[] nums){
        int start=0;
        int end= nums.length-1;
        while (start<end){
            int tmp=nums[start];
            nums[start]=nums[end];
            nums[end]=tmp;
            start++;
            end--;
        }
        return nums;
    }
}
