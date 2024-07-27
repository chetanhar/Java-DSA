package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1};
        int n=nums.length;
        cyclicsort(nums);
        for (int i =0; i< nums.length; i++)
            System.out.print(nums[i] + " ");
    }

    private static void cyclicsort(int[] arr) {
               int i=0;
               while(i < arr.length){
                   int correctIndex=arr[i]-1;
                   if(arr[i]!=arr[correctIndex]){
                       int tmp=arr[i];
                       arr[i]=arr[correctIndex];
                       arr[correctIndex]=tmp;
                   }else{
                       i++;
                   }
                }
            }
}
