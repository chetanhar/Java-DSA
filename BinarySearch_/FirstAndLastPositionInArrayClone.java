package BinarySearch_;

import java.util.Arrays;
import java.util.List;

public class FirstAndLastPositionInArrayClone {
    public static void main(String[] args) {
        Integer[] nums={0 ,0, 1, 1, 2, 2, 2, 2};
        List<Integer> ls=Arrays.asList(nums);
        int target = 2;
        Integer[] output=firstAndLastPosition(ls,ls.size(),target);
        System.out.println(Arrays.toString(output));
    }

    private static Integer[] firstAndLastPosition(List<Integer> ls, int size, int target) {
        Integer[] result =new Integer[2];
        result[0]=firstPosition(ls,size,target);
        result[1]=lastPosition(ls,size,target);
        return result;
    }

    private static Integer lastPosition(List<Integer> ls, int size, int target) {
        int start=0;
        int end=size-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(ls.get(mid)==target){
                ans=mid;
                start=mid+1;
            }
            if(ls.get(mid)>target){
                end=mid-1;
            }
            if(ls.get(mid)<target){
                start=mid+1;
            }
        }
        return ans;
    }

    private static Integer firstPosition(List<Integer> ls, int size, int target) {
        int start=0;
        int end=size-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(ls.get(mid)==target){
                ans=mid;
                end=mid-1;
            }
            if(ls.get(mid)>target){
                end=mid-1;
            }
            if(ls.get(mid)<target){
                start=mid+1;
            }
        }
        return ans;
    }
}
