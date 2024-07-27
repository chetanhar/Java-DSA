package BinarySearch_;

public class SeacrchInMountainArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,3,1};
        int target=2;
        System.out.println(search(nums,target));
    }

    private static int search(int[] nums, int target) {
        int peak=peakinmountainarray(nums);
        System.out.println(peak);
        int start=0;
        int end=nums.length-1;
        int firsttry=orderagnosticbs(nums,target,start,peak);
        if(firsttry!=-1){
            return firsttry;
        }
        return orderagnosticbs(nums,target,peak+1,end);


    }

    static int orderagnosticbs(int[] arr, int target, int start, int end) {
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }


    private static int peakinmountainarray(int[] nums){
        int start=0;
        int end= nums.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }else{
                end=mid;
            }
        } return start;
    }
}
