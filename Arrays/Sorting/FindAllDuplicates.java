package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        List<Integer> list=new ArrayList<>();
        list=findNumber(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(list);
    }

    private static List<Integer> findNumber(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                int tmp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = tmp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1){
                list.add(nums[j]);
            }
        }
        return list;
    }
}
