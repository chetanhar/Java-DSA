package BinarySearch_;


public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,10};
        int target=3;
        int output=infinitearray(nums,target);
        System.out.println(output);
    }

    private static int infinitearray(int[] nums, int target) {
        int start=0;
        int end=1;
        while(target>nums[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarySearchcode(nums, target, start, end);
    }

    private static int binarySearchcode(int[] nums,int target,int start, int end) {
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
