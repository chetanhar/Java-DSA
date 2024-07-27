package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(res,candidates,target,new ArrayList<>(),0);
        return res;
    }
    private static void backtrack(List<List<Integer>> res,int[] candidates,int remain,List<Integer> tmp,int start){
        if(remain<0)return;
        if(remain==0)res.add(new ArrayList<>(tmp));
        for(int i=start;i<candidates.length;i++){
            tmp.add(candidates[i]);
            backtrack(res,candidates,remain-candidates[i],tmp,i);
            tmp.remove(tmp.size()-1);
        }
    }
}
