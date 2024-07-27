package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopoSort {
    public static void main(String[] args) {

    }
    public static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        int[] va=new int[V];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<V;i++){
            if(va[i]==0){
                dfs(i,V,va,adj,s);
            }
        }
        int[] ls=new int[V];
        for(int i=0;i<V;i++){
            ls[i]=s.pop();
        }
        return ls;
    }
    private static void dfs(int i,int V,int[] va,ArrayList<ArrayList<Integer>> adj,Stack<Integer> s){
        va[i]=1;
        for(int it:adj.get(i)){
            if(va[it]==0){
                dfs(it,V,va,adj,s);
            }
        }
        s.push(i);
    }
}
