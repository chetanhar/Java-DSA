package BinarySearch_;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={1,3,5,7,9,11,13};
        int target=3;
        int output=binarysearch(nums,target);
        System.out.println(output);
    }

    private static int binarysearch(int[] nums,int target) {
        int start=0;
        int end=nums.length-1;
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
}
