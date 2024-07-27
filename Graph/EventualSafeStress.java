package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class EventualSafeStress {
    public static void main(String[] args) {

    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<>();
        int m= graph.length;
        int n=graph[0].length;
        for (int i = 0; i < m; i++) {
            ans.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                ans.get(i).add(graph[i][j]);
            }
        }
        int v=ans.size();
        int[] va=new int[v];
        int[] pva=new int[v];
        int[] points=new int[v];
        for (int i = 0; i < v; i++) {
            dfsNew(i,va,pva,points,ans);
        }
        List<Integer> ls=new ArrayList<>();
        for (int i = 0; i < v; i++) {
            if(points[i]==1){
                ls.add(i);
            }
        }
        return ls;


    }

    private boolean dfsNew(int i, int[] va, int[] pva, int[] points, List<List<Integer>> ans) {
        va[i]=1;
        pva[i]=1;
        points[i]=0;
        for (int it:
                ans.get(i)) {
            if(va[it]==0){
                if(dfsNew(it,va,pva,points,ans)==true)return true;
            } else if (pva[it]==1) {
                return true;
            }
        }
        points[i]=1;
        pva[i]=0;
        return false;
    }
}
