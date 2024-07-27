package Heaps;

import java.util.*;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr= {3, 4, 1, 10, 9};
        heapSort(arr);
        System.out.print(Arrays.toString(arr));
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    }
    public static void heapSort(int[] arr){
        int n= arr.length;
        //to make it max Heap
        for (int i = n/2; i >0 ; i--) {
            heapify(arr,n,i);
        }
        for (int i = n-1; i >=0 ; i--) {
            int s=arr[1];
            arr[1]=arr[i];
            arr[i]=s;
            heapify(arr,i,1);
            }
        }
    private static void heapify(int[] arr, int n, int i) {
        int largest=i;
        int left=2*i;
        int right=2*i+1;
        // if left child is larger than root
        if(left<n&&arr[left]>arr[largest]){
            largest=left;
        }
        if(right<n&&arr[right]>arr[largest]){
            largest=right;
        }if(largest!=i){
            int swap=arr[largest];
            arr[largest]=arr[i];
            arr[i]=swap;
            heapify(arr,n,largest);
        }
    }
}
