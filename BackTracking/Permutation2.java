package BackTracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Permutation2 {
    public static void main(String[] args) {
        System.out.println(permuteUnique(new int[]{1,1,2}));
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permut(nums, res, new ArrayList<>(),new boolean[nums.length]);
        return res;
    }

    private static void permut(int[] nums, List<List<Integer>> res, List<Integer> current,boolean[] vis){
        if(current.size()==nums.length){
            if(!res.contains(current)) {
                current.sort(Comparator.naturalOrder());
                res.add(new ArrayList<>(current));
            }
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(vis[i])continue;
            if(i>0&& !vis[i-1] && nums[i]==nums[i-1]){
                continue;
            }
            vis[i]=true;
            current.add(nums[i]);
            permut(nums,res,current,vis);
            current.remove(current.size()-1);
            vis[i]=false;
        }
    }

}
