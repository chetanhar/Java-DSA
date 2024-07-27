package Graph;

import java.util.ArrayList;

public class NumberOfProvinces {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i <= 8; i++) {
            adj.add(new ArrayList<>());
        }
        //edge 1--2
        adj.get(1).add(2);
        adj.get(2).add(1);

        //edge 2--3
        adj.get(2).add(3);
        adj.get(3).add(2);

        //edge 4--5
        adj.get(4).add(5);
        adj.get(5).add(4);

        //edge 5--6
        adj.get(5).add(6);
        adj.get(6).add(5);

        //edge 7--8
        adj.get(7).add(8);
        adj.get(8).add(7);

      NumberOfProvinces np=new NumberOfProvinces();
      int a=np.numberOfProvinces(9,adj);
      System.out.println(a);
    }

    private int numberOfProvinces(int n, ArrayList<ArrayList<Integer>> adj) {
        boolean[] b=new boolean[n];
        int cnt=0;
        for (int i = 1; i < n; i++) {
            if(!b[i]){
                cnt++;
                dfs(i,b,adj);
            }
        }
        return cnt;
    }

    private void dfs(int i, boolean[] b,ArrayList<ArrayList<Integer>> adj) {
        b[i]=true;
        for (Integer al:
             adj.get(i)) {
            if(!b[al]){
                dfs(al,b,adj);
            }
        }
    }
}
