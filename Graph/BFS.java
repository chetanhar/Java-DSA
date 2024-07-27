package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        int n=5,m=7;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        //edge 1--2
        adj.get(1).add(2);
        adj.get(2).add(1);

        //edge 1--5
        adj.get(1).add(5);
        adj.get(5).add(1);

        //edge 2--3
        adj.get(2).add(3);
        adj.get(3).add(2);

        //edge 2--5
        adj.get(2).add(5);
        adj.get(5).add(2);

        //edge 3--4
        adj.get(3).add(4);
        adj.get(4).add(3);

        //edge 3--5
        adj.get(3).add(5);
        adj.get(5).add(3);

        //edge 4--5
        adj.get(4).add(5);
        adj.get(5).add(4);
        BFS b=new BFS();
        ArrayList<Integer> ans=b.bfsGraph(n+1,adj);
        System.out.println(ans);
    }

    private ArrayList<Integer> bfsGraph(int n, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs=new ArrayList<>();
        boolean b[]=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.offer(1);
        b[1]=true;
        while (!q.isEmpty()){
            Integer node=q.poll();
            bfs.add(node);
            for (Integer d:
                 adj.get(node)) {
                if(!b[d]){
                    b[d]=true;
                    q.offer(d);
                }
            }
        }
        return bfs;
    }


}
