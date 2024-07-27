package BackTracking;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Combination3 {
    public static void main(String[] args) {
        System.out.println(combine(4,3));
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            List<Integer> current = new ArrayList<>();
            current.add(i);
            backtrack(res, current, n, k, i);
        }
        return res;
    }

    private static void backtrack(List<List<Integer>> res, List<Integer> current, int n, int k, int val) {
        if (current.size() == k) {
            current.sort(Comparator.naturalOrder());
            if (!res.contains(current)) {
                res.add(new ArrayList<>(current));
            }
            return;
        }
        for (int i = val + 1; i <= n; i++) {
            if(current.contains(i)||i<current.get(current.size()-1)){
               continue;
            }
            current.add(i);
            backtrack(res,current,n,k,val);
            current.remove(current.size() - 1);
        }
    }
}
