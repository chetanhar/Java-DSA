package BinarySearch_;

import java.util.Arrays;

public class Sortednums {
    public static void main(String[] args) {
        int[][] nums={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        System.out.println(Arrays.toString(searchnums(nums,16)));
    }
    private static int[] binarysearch(int[][] nums, int target, int row, int cstart, int cend){
        while (cstart<=cend){
            int mid=cstart+(cend-cstart)/2;
            if(nums[row][mid]==target){
                return new int[]{row,mid};
            }else if(nums[row][mid]<target){
                cstart=mid+1;
            }else if(nums[row][mid]>target){
                cend=mid-1;
            }
        }return new int[]{-1,-1};
    }

    private static int[] searchnums(int[][] nums, int target) {
        int rows = nums.length;
        int col = nums[0].length;
        if (rows == 1) {
            binarysearch(nums, target, 0, 0, col - 1);
        }
        if (col == 0) {
            return new int[]{-1, -1};
        }
        int rstart = 0;
        int rend = rows - 1;
        int cmid = col / 2;
        while (rstart < (rend-1)) {
            int rmid = rstart + (rend - rstart) / 2;
            if (nums[rmid][cmid] == target) {
                return new int[]{rmid, cmid};
            }
            if (nums[rmid][cmid] < target) {
                rstart = rmid;
            }
            if (nums[rmid][cmid] > target) {
                rend = rmid;
            }
        }
        //now only 2 rows remains
        if (nums[rstart][cmid] == target) {
            return new int[]{rstart, cmid};
        }
        if (nums[rstart + 1][cmid] == target) {
            return new int[]{rstart + 1, cmid};
        }
        //1st half
        if(target<nums[rstart][cmid]){
            return binarysearch(nums,target,rstart,0,cmid-1);
        }
        //2nd half
        if(target>nums[rstart][cmid]&&target<nums[rstart][col-1]){
            return binarysearch(nums,target,rstart,cmid+1,col-1);
        }//3rd half
        if(target<nums[rstart+1][cmid]){
            return binarysearch(nums,target,rstart+1,0,cmid-1);
        }//4th half
        else{
            return binarysearch(nums,target,rstart+1,cmid+1,col-1);

        }
    }
}
