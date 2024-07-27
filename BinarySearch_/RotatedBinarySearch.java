package BinarySearch_;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] nums = {9,9,9, 1, 2, 9};
        int target = 9;
        int pivot =findpivotwithduplicates(nums);
        System.out.println(pivot);
        int output = searchelement(nums, target);
        System.out.println(output);
    }

    private static int searchelement(int[] nums, int target) {
        int pivot=findPivot(nums);
        if(pivot==-1){
            return binarySearches(nums,target,0,nums.length-1);
        }else if(target==nums[pivot]){
            return pivot;
        }else if(target>=nums[0]){
            return binarySearches(nums,target,0,pivot-1);
        }
            return binarySearches(nums,target,pivot+1,nums.length-1);
    }

    private static int binarySearches(int[] nums, int target, int start, int end) {
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    private static int findPivot(int[] nums){
        int start=0;
        int end=nums.length;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] < nums[mid - 1]) {
                return mid - 1;
            } else if (nums[mid] > nums[start]) {
                start = mid + 1;
            } else if (nums[mid]<=nums[start]) {
                end=mid-1;
            }
        } return -1;
    }
    private static int findpivotwithduplicates(int[] nums){
        int start=0;
        int end= nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(mid>start&&nums[mid]<nums[mid-1]){
                return mid-1;
            }else if(mid<end&&nums[mid]>nums[mid+1]){
                return mid;
            }else if(nums[start]==nums[mid]&&nums[end]==nums[mid]){
                if(start<end&&nums[start]>nums[start+1]){
                    return start;
                }
                start++;
                if (end>start&&nums[end]<nums[end-1]) {
                    return end-1;
                }
                end--;
            } else if (nums[start]<nums[mid]||nums[start]==nums[mid]&&nums[mid]>nums[end]) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }return -1;
    }

}

