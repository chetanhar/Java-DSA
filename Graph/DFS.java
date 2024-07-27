package Graph;

import java.util.ArrayList;

public class DFS {
    public static void main(String[] args) {
        int n=6;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        //edge 1--2
        adj.get(1).add(2);
        adj.get(2).add(1);

        //edge 1--3
        adj.get(1).add(3);
        adj.get(3).add(1);

        //edge 2--4
        adj.get(2).add(4);
        adj.get(4).add(2);

        //edge 2--5
        adj.get(2).add(5);
        adj.get(5).add(2);

        //edge 3--6
        adj.get(3).add(6);
        adj.get(6).add(3);

        DFS b=new DFS();
        ArrayList<Integer> ans=b.dfsGraph(n+1,adj);
        System.out.println(ans);
    }

    public ArrayList<Integer> dfsGraph(int n, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> d=new ArrayList<>();
        boolean[] b=new boolean[n];
        dfs(1,b,d,adj);
        return d;
    }

    private void dfs(int i, boolean[] b, ArrayList<Integer> d, ArrayList<ArrayList<Integer>> adj) {
        b[i]=true;
        d.add(i);
        for (Integer it:
             adj.get(i)) {
            if(!b[it]){
                dfs(it,b,d,adj);
            }
        }
    }
}
