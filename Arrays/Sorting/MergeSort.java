package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums={8,9,6,3,2,1};
        //int[] ans=merge(nums);
       // System.out.println(Arrays.toString(ans));
    }

//    public static int[] merge(int[] num) {
//        if (num.length == 1) {
//            return num;
//        }
//        int mid = num.length / 2;
//        int[] first = merge(Arrays.copyOfRange(num, 0, mid));
//        int[] second = merge(Arrays.copyOfRange(num, mid, num.length));
//
//        return mergeSort(first, second);
//
//    }
//
//    private static int[] mergeSort(int[] first, int[] second) {
//        int[] mix = new int[first.length + second.length];
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        while (i < first.length && j < second.length) {
//            if (first[i] < second[j]) {
//                mix[k] = first[i];
//                i++;
//                k++;
//            } else {
//                mix[k] = second[j];
//                j++;
//                k++;
//            }
//        }
//        while(i<first.length){
//            mix[k]=first[i];
//            i++;
//            k++;
//        }
//        while (j < second.length) {
//            mix[k]=second[j];
//            j++;
//            k++;
//        }
//        return mix;
//    }
    public static int[] mergeSort(int[] arr, int l, int r){
        int[] tmp=mergearrays(arr,l,r);
        return tmp;
    }
    private static int[] mergearrays(int[] arr, int l,int r){
        if(arr.length==1){
            return arr;
        }
        int mid=l+(r-l)/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr, 0, mid),0,mid);
        int[] right=mergeSort(Arrays.copyOfRange(arr, mid, r),mid,r);
        return merge(left,right);
    }
    private static int[] merge(int[] left,int[] right){
        int[] result =new int[left.length+right.length];
        int i=0,j=0,k=0;
        while(i<left.length&&j<right.length){
            if(left[i]<right[j]){
                result[k]=left[i];
                k++;
                i++;
            }
            else{
                result[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<left.length){
            result[k]=left[i];
            k++;
            i++;
        }
        while(j<right.length){
            result[k]=right[j];
            k++;
            j++;
        }
        return result;

    }
}
