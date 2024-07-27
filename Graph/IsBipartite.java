package Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class IsBipartite {
    public static void main(String[] args) {

    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int m = graph[0].length;
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        for (int i=0; i < n; i++) {
            ls.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ls.get(i).add(graph[i][j]);
            }
        }
        int[] va = new int[n];
        Arrays.fill(va,-1);
        for (int i = 0; i < ls.size(); i++) {
            if(va[i]==-1){
                if(dfs1(i,0,va,ls)==false)return false;
            }
        }
        return true;
    }

    private boolean dfs1(int i, int i1, int[] va, ArrayList<ArrayList<Integer>> ls) {
        va[i]=i1;
        for (int h:
             ls.get(i)) {
            if(va[h]==-1){
                if(dfs1(h,1,va,ls)==false)return false;
            }else if(va[h]==i1)return false;
        }
        return true;
    }
}
