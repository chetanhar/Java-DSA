package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(candidates,target,res,new ArrayList<>(),0);
        return res;
    }

    private void backtrack(int[] candidates, int remain, List<List<Integer>> res, ArrayList<Integer> tmp, int start) {
        if(remain<0)return;
        if(remain==0)res.add(new ArrayList<>(tmp));
        for (int i = start; i < candidates.length; i++) {
            tmp.add(i);
            backtrack(candidates,remain-candidates[i],res,tmp,i+1);
            tmp.remove(tmp.size()-1);
        }
        
    }
}
