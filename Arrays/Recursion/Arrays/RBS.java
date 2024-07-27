package Recursion.Arrays;

public class RBS {
    public static void main(String[] args) {
        int[] nums = {7, 8, 9, 1, 2, 3, 4};
        int target = 2;
        System.out.println(binarySearch(nums, target, 0, nums.length-1));
    }

    private static int binarySearch(int[] nums, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (start > end) {
            return -1;
        }
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[start] <= nums[mid]) {
            if (target >= nums[start] && target <= nums[mid]) {
                return binarySearch(nums,target,start,mid-1);
            }else {
                return binarySearch(nums, target, mid + 1, end);
            }
        }
        if(target>=nums[mid]&&target<=nums[end]){
            return binarySearch(nums,target,mid+1,end);
        }
        return binarySearch(nums,target,start,mid-1);
    }
}
