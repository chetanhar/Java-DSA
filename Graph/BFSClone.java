package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSClone {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> r=new ArrayList<>();
        for (int i = 0; i <=7 ; i++) {
            r.add(new ArrayList<>());
        }
        //edge 1--2
        r.get(1).add(2);
        r.get(2).add(1);
        //edge 1--3
        r.get(1).add(3);
        r.get(3).add(1);
        //edge 2--4
        r.get(2).add(4);
        r.get(4).add(2);
        //edge 2--5
        r.get(2).add(5);
        r.get(5).add(2);
        //edge 3--6
        r.get(3).add(6);
        r.get(6).add(3);
        //edge 3--7
        r.get(3).add(7);
        r.get(7).add(3);
        BFSClone bc=new BFSClone();
        ArrayList<Integer> ans=bc.bfs(8,r);
        System.out.println(ans);
//        for (int i = 0; i <= 7; i++) {
//            for (int j = 0; j < r.get(i).size(); j++) {
//                System.out.print(r.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }
    }

    private ArrayList<Integer> bfs(int n, ArrayList<ArrayList<Integer>> r) {
        ArrayList<Integer> g=new ArrayList<>();
        boolean[] b=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.offer(1);
        b[1]=true;
        while (!q.isEmpty()){
            Integer node=q.poll();
            g.add(node);
            for (Integer h:
                 r.get(node)) {
                if(!b[h]){
                    b[h]=true;
                    q.offer(h);
                }
            }
        }
        return g;
    }
}
