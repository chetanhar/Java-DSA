package Arrays;

import java.util.ArrayList;

public class Duplicates {

    public static void main(String[] args) {
        int[] nums=new int[]{1,10,10,3,3,4};
        System.out.println(duplicates(nums,6));
    }

    public static ArrayList<Integer> duplicates(int arr[], int n) {

        ArrayList<Integer>list = new ArrayList<>();
        int a[] = new int [n];
        for(int i=0; i<n; i++){
            a[arr[i]]+=1;
        }
        for(int i=0; i<n; i++){
            if(a[i]>1) list.add(i);
        }
        if(list.size()==0) list.add(-1);
        return list;
    }
}
