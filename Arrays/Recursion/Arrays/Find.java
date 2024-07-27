package Recursion.Arrays;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6};
        //findIndexLast2(nums, 5, 0);
        //System.out.println(list);
        System.out.println(findAllIndex2(nums, 4, 0));
    }

    private static boolean find(int[] nums, int target, int index) {
        if (index == nums.length) {
            return false;
        }
        return nums[index] == target || find(nums, target, index + 1);
    }

    private static int findindex(int[] nums, int target, int index) {
        if (index == nums.length) {
            return -1;
        }
        if (nums[index] == target) {
            return index;
        } else
            return findindex(nums, target, index + 1);
    }
    private static int findIndexLast(int[] nums, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (nums[index] == target) {
            return index;
        } else
            return findIndexLast(nums, target, index - 1);
    }
    static ArrayList<Integer> list=new ArrayList<>();
    private static void findIndexLast2(int[] nums, int target, int index) {
        if (index == nums.length) {
            return;
        }
        if (nums[index] == target) {
            list.add(index);
        } else
            findIndexLast2(nums,target,index+1);
    }
    private static ArrayList<Integer> findAllIndex(int[] nums, int target, int index, ArrayList<Integer> list){
        if(index== nums.length){
            return list;
        }
        if(nums[index]==target){
            list.add(index);
        }
        return findAllIndex(nums,target,index+1,list);
    }
    private static ArrayList<Integer> findAllIndex2(int[] nums, int target, int index){
        ArrayList<Integer> list1= new ArrayList<>();
        if(nums.length==index){
            return list1;
        }
        if(nums[index]==target){
            list1.add(index);
        }
        ArrayList<Integer> res= findAllIndex2(nums,target,index+1);
        list1.addAll(res);
        return list1;
    }
}
