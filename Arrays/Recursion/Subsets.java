package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
    int[] nums={1,2,3};
        System.out.println(subsets(nums));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums, output, index, ans);
        return ans;
    }

    private static void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans) {
        // Base condition
        if (index >= nums.length) {
            if(ans.contains(output))
            ans.add(new ArrayList<>(output)); // Create a new ArrayList and add it to ans
            return;
        }

        // Exclude
        solve(nums, output, index + 1, ans);

        // Include
        int element = nums[index];
        output.add(element);
        solve(nums, output, index + 1, ans);
        output.remove(output.size() - 1); // Remove the last element to backtrack
    }

    public static int subsetssum(int[] nums,int target) {
        List<List<Integer>> ans=new ArrayList<>();
        solvesum(nums,new ArrayList<>(),0,ans,target);
        return ans.size();

    }

    private static void solvesum(int[] nums, List<Integer> output, int index, List<List<Integer>> ans,int target) {
        //base condition
        if(index>= nums.length){
            int sum=0;
            for(int i=0;i< output.size();i++){
                sum+=output.get(i);
            }
            if(sum==target)
                ans.add(output);
            return;
        }
        //exclude
        solvesum(nums,output,index+1,ans,target);

        //include
        ArrayList<Integer> ner=new ArrayList<>(output);
        ner.add(nums[index]);
        solvesum(nums,ner,index+1,ans,target);
    }

    public static ArrayList<String> subsequences(String str) {
        ArrayList<String> newarray=new ArrayList<>();
        newarray=solve(0,new String(), newarray,str);
        return newarray;
    }
    private static ArrayList<String> solve(int index, String curr, ArrayList<String> all, String arr){
        if(index>=arr.length()){
            all.add(curr);
            return all;
        }
        //in
        String newstr=curr;
        newstr+=arr.charAt(index);
        solve(index+1,newstr,all,arr);

        //exc
        solve(index+1,curr,all,arr);
        return all;
    }
    public static ArrayList<Integer> subsetSum(int num[]) {
        ArrayList<Integer> finalSum=new ArrayList<>();
        finalSum=solve4(0,new ArrayList(),num,finalSum);
        return finalSum;
    }
    private static ArrayList<Integer> solve4(int index, ArrayList<Integer> curr,int num[],ArrayList<Integer> finalSum){
        if(index==num.length){
            int sum=0;
            for(int i=0;i<curr.size();i++){
                sum+=num[i];
            }
            finalSum.add(sum);
            return finalSum;
        }
        //exclude
        solve4(index+1,curr,num,finalSum);

        //include
        ArrayList<Integer> r=new ArrayList<>(curr);
        r.add(num[index]);
        solve4(index+1,r,num,finalSum);
        return finalSum;
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(candidates);
        result=solve6(0,candidates,target,new ArrayList(),result);
        return result;
    }
    private static List<List<Integer>> solve6(int index,int[] candidates, int target,List<Integer> ds,List<List<Integer>> result){
        if(index==candidates.length){
            if(target==0){
                if(!result.containsAll(ds))
                result.add(new ArrayList<>(ds));
            }
            return result;
        }
        if(candidates[index]<=target){
            ds.add(candidates[index]);
            solve6(index+1,candidates,target-candidates[index],ds,result);
            ds.remove(ds.size()-1);
        }
        solve6(index+1,candidates,target,ds,result);
        return result;
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        result=solve7(0,nums,new ArrayList(),result);
        return result;
    }
    private static List<List<Integer>> solve7(int index, int[] nums, List<Integer> tmp, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(tmp));
            return result;
        }
        if (index == nums.length - 1) {
            tmp.add(nums[index]);
            solve7(index + 1, nums, tmp, result);
            tmp.remove(tmp.size() - 1);
        }
        if (index == nums.length - 1)
            solve7(index, nums, tmp, result);
        return result;
    }


}
