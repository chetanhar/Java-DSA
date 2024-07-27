package Recursion.Arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 7};
        int index = 0;
        System.out.println(check(nums, index));
    }

    private static boolean check(int[] nums, int index) {
        if (index == nums.length - 1) {
            return true;
        }
        return nums[index] < nums[index + 1] && check(nums, index + 1);
    }
}
