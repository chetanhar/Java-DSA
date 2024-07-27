package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}));
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(nums,new ArrayList<>(),res);
        return res;
    }

    private static void backtrack(int[] nums, List<Integer> current, List<List<Integer>> res) {
        if(nums.length==current.size()){
            res.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(current.contains(nums[i])){
                continue;
            }
            current.add(nums[i]);
            backtrack(nums,current,res);
            current.remove(current.size()-1);
        }
    }
}
