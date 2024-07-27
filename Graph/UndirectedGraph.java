package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class UndirectedGraph {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] b=new boolean[V];
        for (int i = 0; i < V; i++) {
            if(b[i]==false){
                if(checkforCycle(b,i,adj,V)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkforCycle(boolean[] b, int i, ArrayList<ArrayList<Integer>> adj, int v) {
        Queue<Node> q=new LinkedList<>();
        q.offer(new Node(i,-1));
        b[i]=true;
        while (!q.isEmpty()){
            int size=q.size();
            Node poll=q.poll();
            int first= poll.first;
            int parent= poll.second;
            for(int s:adj.get(first)){
                if(!b[s]){
                    q.offer(new Node(s,first));
                    b[s]=true;
                } else if (s!=parent) {
                    return true;
                }

            }
        }
        return false;
    }
    class Node{
        int first;
        int second;

        public Node(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

}

