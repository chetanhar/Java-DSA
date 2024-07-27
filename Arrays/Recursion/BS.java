package Recursion;

import java.math.BigInteger;

public class BS {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,15};
        int target=1;
        int start=0;
        int end=arr.length-1;
        int result=binarySearch(arr,target,start,end);
        System.out.println(result);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        int mid=start+(end-start)/2;
        if(start>end){
            return -1;
        }
        if(target==arr[mid]){
            return mid;
        }
        if(target<arr[mid]){
            return binarySearch(arr,target,start,mid-1);
        }
            return binarySearch(arr,target,mid+1,end);
    }
}
