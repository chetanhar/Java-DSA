package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopoSortByKahnAlgo {
    public static void main(String[] args) {

    }
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        int[] indegree=new int[V];
        for (int i = 0; i < V; i++) {
            for (int it:
                    adj.get(i)) {
                indegree[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if(indegree[i]==0)q.offer(i);
        }
        int[] topo=new int[V];
        int i=0;
        while (!q.isEmpty()){
            int p=q.poll();
            topo[i++]=p;
            for (int it:
                 adj.get(p)) {
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }
        return topo;
    }
}
